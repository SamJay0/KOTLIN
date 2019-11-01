package aquarium

//we use open so as to be able to subclass it
open class Aquarium(var length:Int=20, var height:Int=30, var width:Int= 40) {

     //expressing function as an expression
    //fun volume() :Int = length*width*height/1000

    //overwriting getter for value
    val volume : Int
    get() {
        return width*height*length/100
    }
}