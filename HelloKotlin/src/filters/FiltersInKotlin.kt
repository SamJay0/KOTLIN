package filters

fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper","yellow curry" )

    //print those starting with c
    println(spices.filter { it[0]=='c' })
    println(spices.filter { it.startsWith('c') })

    //Create a filter that gets all the curries and sorts them by string length.
    val spices1=spices.filter { it.contains("curry")  }.sortedBy { it.length }
    println(spices1)

    //Filter the list of spices to return all the spices that start with 'c' and end in 'e'

    val spices2=spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(spices2)

    //Take the first three elements of the list and return the ones that start with 'p'
    println(spices.take(3).filter { it.startsWith('p') })
}