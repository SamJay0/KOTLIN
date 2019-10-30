import java.util.*

fun main() {
    feedTheFish()
}
fun feedTheFish(){
    val day= randomDay()
    val food= fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeTheWater(day = day,temp = 30,dirty = 2)){
        println("change the water today")
    }
    println(fitMoreFish(10,listOf(3,3,3)))
    println(fitMoreFish(8,listOf(2,2,2),hasDecorations = false))
    println(fitMoreFish(9,currentFish = listOf(1,1,3),fishSizeInInchesToAdd = 3))
    println(fitMoreFish(10,currentFish = listOf(), hasDecorations = true))

}
fun randomDay(): String{
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}
fun fishFood(day : String) :String{
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" ->"redworms"
        "Wednesday" ->"granules"
        "Thursday" ->"mosquitoes"
        "Friday" ->"plankton"

        else ->"fasting"
    }
}
fun shouldChangeTheWater(day :String, temp :Int=20, dirty :Int=20) : Boolean{
return true
}
fun fitMoreFish(tankSizeInGallons :Int,currentFish :List<Int>,fishSizeInInchesToAdd : Int=2,hasDecorations: Boolean=true) : Boolean{
    var totalFIshLength=0
    for(fish in currentFish){
        totalFIshLength +=fish
    }
    if(hasDecorations){
        if(totalFIshLength >= ((0.8).times(tankSizeInGallons)) || (fishSizeInInchesToAdd.plus(totalFIshLength)>((0.8).times(tankSizeInGallons)) ) ){
            return false
        }
        return true
    }else{
        if (totalFIshLength >=tankSizeInGallons || (fishSizeInInchesToAdd.plus(totalFIshLength))> tankSizeInGallons){
           return false
        }
        return true
    }
}