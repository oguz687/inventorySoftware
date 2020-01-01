package di
import contract.*
import model.*
import presenter.*
import view.*
import org.koin.*
import org.koin.core.context.startKoin
import org.koin.dsl.module

class Dependency{
    val modules= module {
        single {Database}
        factory { MainModel() }
        factory { Product(get(),get(),get(),get()) }
    }


    fun main(){
        startKoin { modules(listOf(modules))}
    }
}