import kotlin.math.pow

fun main(){
        println("Hello world")
        val numberOfFish=50
        check(numberOfFish)

        val array = Array(7){1000.0.pow(it)}
        val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
        for ((i, value) in array.withIndex()) {
            println("1 ${sizes[i]} = ${value.toLong()} bytes")
        }

    }
    fun check(number : Int){

        when(number){
            0 -> println("No fish ")
            in 1..19 -> println("it is a good number")
            20 -> println("full capacity")
            else -> println("Too much")
        }
    }
