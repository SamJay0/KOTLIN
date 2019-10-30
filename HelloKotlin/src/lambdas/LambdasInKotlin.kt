package lambdas

import kotlin.random.Random

fun main() {
    gamePlay(rollDice)
    gamePlay(rollDice2(4))

}
//Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
val rollDice ={Random.nextInt(12)+1}()

//Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
val rollDice1 ={sides :Int -> if(sides==0) 0 else (Random.nextInt(12)+1)}

//Create a new variable, rollDice2, for this same lambda using the function type notation.
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random.nextInt(sides) + 1
}

// function rollDice
fun rollDice(): Int{
    return  Random.nextInt(12)
}
//Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
fun gamePlay(diceRoll :Int){
    println(diceRoll)
}