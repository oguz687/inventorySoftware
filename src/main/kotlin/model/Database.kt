package model
import com.mongodb.*
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import contract.ContractInterface
import org.bson.Document
import org.koin.core.inject
import java.util.*

class Database() {


//    val client = MongoClient(MongoClientURI("mongodb://localhost:27017"))
//    val database = client.getDatabase("stok")
//    val collection = database.getCollection("ürünler")
    val conn=ConnectionString("mongodb://localhost:27017")
    val sett=MongoClientSettings.builder().applyConnectionString(conn).retryWrites(true).build()
    val client= MongoClients.create(sett)
    val db=MongoClient().getDatabase("stok")
    init {

        try {
//            this.client
//            this.database
//            this.collection
            this.db
        } catch (e: MongoException) {
            e.printStackTrace()
        } finally {
            client.close()

        }

    }
    companion object Factory{
        fun create():Database=Database()
}

}
fun main(){
    val fsd=Database()
    val doc=Document().append("product","rgergsdfsdf")
//    Database.create().collection.insertOne(doc)
    fsd.db.getCollection("ürünler").insertOne(doc)
//    fsd.collection.insertOne(doc)
}

