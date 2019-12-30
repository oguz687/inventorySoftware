package model
import com.mongodb.*
import com.mongodb.client.MongoCollection
import contract.ContractInterface
import org.bson.Document
import org.koin.core.inject
import java.util.*

class Database() {


    val client = MongoClient(MongoClientURI("mongodb://localhost:27017"))
    val database = client.getDatabase("stok")
    val collection = database.getCollection("ürünler")

    init {

        try {
            this.client
            this.database
            this.collection
        } catch (e: MongoException) {
            e.printStackTrace()
        } finally {
            client.close()

        }

    }
}

