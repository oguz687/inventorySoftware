package presenter
import contract.ContractInterface.*
import model.Database
import model.MainModel
import model.Product
import view.MainView
import org.koin.*
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.dsl.koinApplication
import org.koin.dsl.module

class MainPresenter(var modell:MainModel) :IPresenter,KoinComponent{
    val hmodel by inject<MainModel>()
    val hproduct by inject<Product>()
    val hview by inject<MainView>()

    override fun getAdd() {

        return hmodel.addProduct(product = hview.clickAddButtons())

    }

    override fun getRemove() {
        return hmodel.removeProduct(product =hview.clickRemoveButton())
    }

    override fun getIncrement() {
        return hmodel.incrementProduct(piece = 23, product = hview.incrementProcess())
    }

    override fun getDecrement() {
        return hmodel.decrementProduct(product = hview.decrementProcess(),piece = 64)
    }

    override fun getCounter() {
        val z=hmodel.counterProduct()
        hview.counterView(count =z )
    }

}