package inventory

class Product(var name:String,
              var desc:String,
              var price:Double,
              var quantityAtHand:Int,
              var minOrder:Int) {


    override fun toString(): String {
        return "$name\t$desc\t$price\t$quantityAtHand\t$minOrder"
    }




}