package read_input_from_commandline

fun main() {
    var av:Int? = readLine()!!.toInt() // !! this operator use for NPE(NullPointerException).
    var (a,b,c,d)= readLine()!!.split(" ")
}