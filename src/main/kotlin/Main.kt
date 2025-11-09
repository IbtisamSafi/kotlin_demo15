package org.bytebloom

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //---------- problems 1( personalized Greeting ) ----------
    println("---------- problems 1( personalized Greeting ) ----------")
    println("please enter your name: ")
    val UserName=readLine()
    println("please entre your favorite color :  ")
    val FavoriteColor=readLine()
    println("Hello : $UserName! I see your favorite color is  : $FavoriteColor.")



    //---------- problems 2( Age in a Decade ) ----------
    println("---------- problems 2( Age in a Decade ) ----------")
    println(" please enter your age : ")
    var UserAge=readLine()?.toInt()
    UserAge = UserAge?.plus(10)
    println("In 10 years , you will be : $UserAge years old.")



    //---------- problems 3(Access Control )---------
    println("---------- problems 3(Access Control )---------")
    println("please enter your age : ")
    val UserAge1= readLine()?.toInt()
    val TheCheck= UserAge1!! >=18
    println("Access Grantd : $TheCheck")



    //--------- problems 4(Even or odd )---------
    println("--------- problems 4(Even or odd )---------")
    println("please enter the number to be checked : ")
    val TheNum= readLine()?.toInt()
    if(TheNum?.rem(2) ==0)
       println("the number $TheNum is even.")
    else
        println("the number $TheNum is odd.")



    //--------- problems 5(String Reverser)---------
    println("--------- problems 5(String Reverser)---------")
    println("please enter the text to be reversed  : ")
    val TheText=readLine()
    val TextReverse= TheText?.reversed()
    println("the text reversed : $TextReverse .")


























}