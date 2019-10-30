package interfaces_abstract_classes.dataclasses

import interfaces_abstract_classes.Curry
import interfaces_abstract_classes.Spice

fun main() {
    for(element in spiceCabinet) println(element.label)
}

//data classes
data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}
val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
    SpiceContainer(Curry("Red Curry", "medium")),
    SpiceContainer(Curry("Green Curry", "spicy")))