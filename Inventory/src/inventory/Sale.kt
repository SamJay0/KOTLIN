package inventory

class Sale {
    val productList: ProductList = ProductList()
    val transaction: SaleTransaction = SaleTransaction()


    override fun toString(): String {
        return "Sale"
    }

    fun menu() {
        print(
            "\tPress 1 to Register a product for sale\n"
                    + "\tPress 2 to Buy a  product to the Cart\n"
                    + "\tPress 3 to Remove a product from cart\n"
                    + "\tPress 4 to View all Available Products\n"
                    + "\tPress 5 to Check out\n"
                    + "\tPress 6 to Get help\n"
                    + "\tPress 7 to Exit\n"
                    + "\nPlease enter your choice: "
        )

    }

    fun register() {
        print("How many products are you registering: ")
        var count = readLine()
        for (i in 1..count!!.toInt()) {
            print("enter product name:")
            var name = readLine().toString()
            print("enter product description:")
            var desc = readLine().toString()
            print("enter product price:")
            var price = readLine()!!.toDouble()
            var quantityAtHand = RandomNumberGenerator().maximumValue
            var minOrder = RandomNumberGenerator().minimumValue
            var myProduct=Product(name,desc,price,quantityAtHand,minOrder)
            println(myProduct)
        }
    }

}

fun main() {
    val sale = Sale()
    sale.register()

}