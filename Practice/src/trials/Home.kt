package trials

class Person {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            for ( i in 1..10){
                Person().squareroot()

            }

        }
    }
    fun getPersonDetails(){
        print("Enter your name:")
        var name:String= readLine()!!
        print("Enter your DOB:")
        var DOB:String = readLine()!!
        print("Enter your occupation: ")
        var occupation:String =readLine()!!

        println("This are your details :" +
                "$name $DOB $occupation")
    }
    fun squareroot():Double{
        print("Enter number to find squareroot")
        var number:Double= readLine()!!.toDouble()
        print(Math.sqrt(number))
        return Math.sqrt(number)
    }

}