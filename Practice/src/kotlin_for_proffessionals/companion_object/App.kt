package kotlin_for_proffessionals.companion_object

/*
*You can run a kotlin file with the main function wrapped in a companion Object
*
* The advantage to this method over a top-level function is that the class name to run is more self-evident, and any
other functions you add are scoped into the class App . This is similar to the Object Declaration example, other
than you are in control of instantiating any classes to do further work.
 */

class App {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
    fun run(){
        println("using companion object")
    }
}