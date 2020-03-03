package inventory

class SaleTransaction {
    var salecode:Int=0
    var items: List<Product> = listOf<Product>()
    var totalCost:Double =0.0

    override fun toString(): String {
        return "transaction"
    }
}