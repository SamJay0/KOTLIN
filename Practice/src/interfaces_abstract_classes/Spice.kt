package interfaces_abstract_classes

fun main() {
delegate()
}
fun delegate() {
    val curry = Curry("","mild")
    println("curry has color ${curry.color}" )
    curry.grind()
}
abstract class Spice(var name :String,var spiciness :String = "mild") {
    val heat :Int
        get() {
            return when (spiciness) {
                "sour" -> 2
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
    abstract fun prepareSpice()

    override fun toString(): String {
        return "[$name  $heat]"
    }
}

 class Curry(name: String,spiciness:String,curryColor: CurryColor=yellowColor):Spice("curry"),Grinder,CurryColor by curryColor{
    override fun prepareSpice() {
        print("preparing spice")
    }

    override fun grind() {
        print("grinding")
    }
}
interface Grinder{
    fun grind()
}
interface CurryColor{
    val color :Color
}
object yellowColor :CurryColor{
    override val color: Color =Color.YELLOW
}

//enum classes
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),YELLOW(0xFFFF00);
}

