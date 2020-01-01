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
import java.util.*
import kotlin.concurrent.schedule

internal class MainModelTest {

    fun getModelClass():MainModel{
        val modelclass= mockk<MainModel>()
        return modelclass
        }

    @Test
    fun databaseControl(){
        val productclass= mockk<Product>(){
            every { name } returns "pantolom"
            every { id } returns 1213
            every { count } returns 12
            every { owner } returns "oğuz"
        }
        val db=Database
        val doc=Document().append("product", mapOf("count " to productclass.count,"owner" to productclass.owner,"id" to productclass.id,"name" to productclass.name))
        db.db.getCollection("ürünler1").insertOne(doc)
        db.client.close()
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