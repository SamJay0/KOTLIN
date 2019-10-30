package functions

import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue

fun main() {
    whatShouldIDoToday("happy","cold", 30)

}
fun whatShouldIDoToday( mood : String,weather : String="sunny",temp : Int =24){
    print("enter  your mood :")
    var mMood = "${readLine()}"
     println(when{
         happyAndWeatherSunny(mMood,"sunny") -> "go for a walk"
         temp >= 25 ->"Its too hot ,take a shower"
         else ->"Stay Home and read"
    })
}
fun happyAndWeatherSunny(mood :String,weather : String) = mood == "happy" && weather == "sunny"