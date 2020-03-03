//change the name of the class that contains top-level functions for a particular file
@file:JvmName("myBook")
package pairs_triples

import java.time.Year
import kotlin.random.Random

//Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
//Create a method that returns both the title and the author as a Pair.
//Create a method that returns the title, author and year as a Triple. Use the documentation to find out how to use Triple.
//Create a book instance.
//Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”

const val maximumNumberOfBooksToBorrow=5
class Book(var title:String, var author:String,var pages:Int, var year: Int) {

//    object Constants{
//        val BASE_URL="https://github.com/SamJay0"
//    }

    companion object{
        const val BASE_URL="https://github.com/SamJay0"
    }
    //pairs in action
    fun getTitleAndAuthor():Pair<String,String>{
        return title to author
    }
    //Triples in use
    fun getBookDetails():Triple<String,String,Int>{
        return Triple(title,author,year)
    }


    //print url
    fun printURL(){
        print("$BASE_URL,$title.html")
    }

    //can borrow
    fun canBorrow(booksBorrowed:Int):Boolean{
        if(booksBorrowed>= maximumNumberOfBooksToBorrow){
            return false
        }
        return true
    }
    //Create an extension function on Book that returns the
    // weight of a book as the page count multiplied by 1.5 grams.

}
fun Book.getWeight():String{
    return ""+pages*1.5+"grams"
}
//Create another extension, tornPages(), that takes the number of torn
// pages as an argument and changes the page count of the book.
fun Book.tornPages(tornPages:Int){
    if (tornPages>=pages){
        pages=0
    }else{
        pages -=tornPages
    }

}
//Write a class Puppy with a method playWithBook() that takes a book as an
// argument, and removes a random number of pages from the book.
class Puppy(){
    fun playWithBook(book: Book){
        book.tornPages(Random.nextInt(book.pages))
    }
}
fun main() {
    val book=Book("Think Big","Ben Carson",20,1990)
//    print(book.getBookDetails())
//    print(book.getTitleAndAuthor())
    print("Here is your book ${book.getBookDetails().first}" +
            " written by ${book.getBookDetails().second} in ${book.getBookDetails().third}\n")
    book.tornPages(4)
    print("pages remaining "+book.pages)
    val puppy =Puppy()
        puppy.playWithBook(book)
        print("\npages remaining "+book.pages)

}