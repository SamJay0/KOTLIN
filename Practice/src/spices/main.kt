package spices

fun main() {
    //var mySimpleSpice= SimpleSpice()
    //println("name = ${mySimpleSpice.nameOfSpice} heat =${mySimpleSpice.heat}
    var mySpices= listOf<Spice>(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    for(spice in mySpices) {
        print(spice)
    }
    println()
    var mySpices1=mySpices.filter { it.heat < 5 }
    for(spice in mySpices1) {
        print(spice)
    }
}