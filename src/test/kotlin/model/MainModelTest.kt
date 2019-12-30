package model

import com.mongodb.client.MongoCollection
import com.mongodb.client.internal.MongoDatabaseImpl
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.koin.core.inject
import io.mockk.*
import io.mockk.impl.annotations.MockK
import org.bson.Document
import org.junit.jupiter.api.BeforeEach
import org.litote.kmongo.insertOne
import tornadofx.c
import tornadofx.getProperty

internal class MainModelTest {


    companion object{

        fun getDatabaseClass():Database{
            return Database()

        }
        fun getModelClass():MainModel{
            val modelclass= mockk<MainModel>()
            return modelclass
        }
        fun getProductClass():Product{
            val productclass= mockk<Product>(relaxed = true){
                every { name } returns "pantolom"
                every { id } returns 1213
                every { count } returns 12
                every { owner } returns "oğuz"

            }
            return productclass

        }

    }

    @Test
    fun databaseControl(){
        val db= getDatabaseClass()
        db.collection.insertOne(Document("product",getProductClass()))
    }
    @Test
    fun addProduct() {


    }
    @Test
    fun incrementProduct() {

    }
    @DisplayName("A negative value for year is not supported by the leap year computation.")
    @Test
    fun decrementProduct() {
    }

    @Test
    fun counterProduct() {
    }


}