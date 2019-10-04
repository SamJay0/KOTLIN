fun main() {
    //untyped arrays i.e takes on any value
    var myArray = arrayOf(2,"juma",2.8,'A')
    //typed Arrays i.e takes on specific values
    var myArray1 = intArrayOf(11,12,13)

    /*
     * Lists can be mutable or immutable
     * */
    //mutable lists
    var myList :MutableList<Int> = mutableListOf(2,4,5)

    /*
    *using for loop to add values to mutable lists
    * i.e add values btn 0 and 100 divisible by 9
     */
    println("original list\n"+myList)
    for (value in 0..100 step 9){
        myList.add(value)
    }
    println("added values btn 0-100 divisible by 9\n"+myList)

    //add values to list from an array using the for loop
    for(element in myArray1){
       myList.add(element)
    }
    println("added values from array\n"+myList)
}