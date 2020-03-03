package kotlin_for_proffessionals.object_declaration
/*
*You can run a kotlin file with the main function wrapped in an Object class
*
* The advantage to this method over a top-level function is that the class
* name to run is more self-evident, and any other functions you add
 */
object App {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello world")
    }
}