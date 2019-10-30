package spices

class Spice(var name :String,var spiciness :String = "mild") {
    val heat :Int
        get() {
            return when (spiciness) {
                "sour" -> 2
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
//    init {
//        println("$name created")
//    }
    //helper function as a constructor
    fun makeSalt()=Spice("salt","bitter")
    //non-default constructor
    constructor(price : Double): this(""){
    }

    override fun toString(): String {
        return "[$name  $heat]"
    }
}