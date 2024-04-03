package com.example.rockpaperscissors
fun main(){
    var computerChoice=""
    var playerChoice=""
    println("Enter your choice(any one) : \n (i)Rock \n (ii)Paper \n (iii)Scissor")
    playerChoice=readln()
    val randomNumber=(1..3).random()
//    if (randomNumber ==1){
//        computerChoice="Rock"
//    }
//    else if (randomNumber ==2){
//        computerChoice="Paper"
//    }
//    else if (randomNumber ==3){
//        computerChoice="Scissors"
    //Using when Keyword :
    when (randomNumber) {
       1 -> {
            computerChoice = "Rock"
        }

        2-> {
            computerChoice = "Paper"
        }

       3-> {
            computerChoice = "Scissor"
        }
    }
    println(computerChoice)
    val winner=when{
        playerChoice==computerChoice -> "Tie"
        playerChoice=="Paper" && computerChoice=="Rock"->"Player"
        playerChoice=="Rock" && computerChoice=="Scissor"->"Payer"
        playerChoice=="Scissor" && computerChoice=="Paper"->"Player"
        else -> "Computer"
    }
    if(winner=="Tie"){
        println("It is tied!!!")
    }
    else if(winner=="Player"){
        println("Player won!")
    }
    else{
        println("$winner won!")
    }
}
