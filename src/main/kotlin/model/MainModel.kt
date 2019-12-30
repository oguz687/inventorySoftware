package model
import contract.ContractInterface.*
import di.Dependency.*
import org.bson.Document
import org.koin.*
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.litote.kmongo.insertOne
import tornadofx.getProperty

class MainModel :IModel,KoinComponent {
    private val database:Database by inject<Database>()

    override fun addProduct(product: IProduct) {
        database.collection.insertOne(Document("ürün",product))

    }

    override fun removeProduct(product: IProduct) {
        database.collection.deleteOne(Document("ürün",product))
    }

    override fun incrementProduct(product: IProduct, piece: Int) {
        val getProduct=database.collection.find(Document("ürün",product))
        getProduct.filter(Document("count",null))
    }

    override fun decrementProduct(product: IProduct, piece: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun counterProduct():Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }



}
data class Product(override var id: Int?,override var name: String?, override var count: Int?, override var owner: String?) :IProduct,KoinComponent