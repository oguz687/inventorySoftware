package contract

import model.Product
import java.util.function.IntConsumer

interface ContractInterface {
    interface IModel{
        fun addProduct(product: IProduct)
        fun removeProduct(product: IProduct)
        fun incrementProduct(product: IProduct,piece:Int)
        fun decrementProduct(product: IProduct,piece: Int)
        fun counterProduct():Int
    }
    interface IView{
        fun clickAddButtons():IProduct
        fun clickRemoveButton():IProduct
        fun incrementProcess():IProduct
        fun decrementProcess():IProduct
    }
    interface IPresenter{
        fun getAdd():Unit
        fun getRemove():Unit
        fun getIncrement():Unit
        fun getDecrement():Unit
        fun getCounter()
    }
    interface IProduct{
        var id:Int?
        var name:String?
        var count:Int?
        var owner:String?
    }
}