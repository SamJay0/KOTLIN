package intoduction

fun main() {

/**   val cond ="Take it easy and enjoy life!"
//    for(i in 1..10){
//        val str =getFortuneCookie();
//        println(str)
//        if (str.equals(cond)) {
//            return
//        }
//    }
**/
    var fortune: String
    for (i in 1..2) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

    //println("\nYour fortune is: ${getFortuneCookie()}")

}
fun getFortuneCookie(birthday : Int) : String{
    var fortunes=listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!","Treasure your friends because they are your greatest fortune")
//    if (birthday==null){
//        birthday=1;
//    }
    /**
     * return birthday based on the remainder ...
     */
    //return fortunes[(birthday.rem(fortunes.size))]
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]

}
fun getBirthday(): Int{
    print("To know your fortune, enter your birthday: ")
    return readLine()?.toIntOrNull() ?:1
}