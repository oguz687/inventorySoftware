package view
import contract.ContractInterface
import javafx.beans.property.SimpleIntegerProperty
import javafx.geometry.Pos
import javafx.scene.layout.BorderPane as ss
import javafx.scene.Parent
import javafx.scene.control.Label
import javafx.scene.layout.AnchorPane
import tornadofx.*
class StokApp : App() {
    override val primaryView = MainView::class

}
class MainView :View(), ContractInterface.IView {
    override val root = hbox {
        button("Press me")
        label("Waiting")
        resize(1020.0,149.0)
    }
//fonksiyon tipi Iproduct olmayacak
    override fun clickAddButtons():ContractInterface.IProduct {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clickRemoveButton():ContractInterface.IProduct {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun incrementProcess():ContractInterface.IProduct {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun decrementProcess():ContractInterface.IProduct {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun counterView(count:Int):Int {
        return count

    }


}
