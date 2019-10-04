package intoduction

import java.util.*

fun printDayOfWeek(){
    var day : Int =Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day){
        1 ->"It is a Sunday"
        2 ->"It is a Monday"
        3 ->"It is a Tuesday"
        4 ->"It is a Wednesday"
        5 ->"It is a Thursday"
        6 ->"It is a Friday"
        7 ->"It is a Saturday"
        else -> "Time has Stopped"

    })
}
fun main(args: Array<String>) {
printDayOfWeek()
}