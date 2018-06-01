package mainargument4

/**
 * Created by pRaNaY on 6/1/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/9b054fd9-dfab-430f-add8-2be2d77167c2
fun main(args:Array<String>){
    println("Hello World")

    val isUnit=println("This is an Expression")
    println(isUnit)

    val temperature=10
    val isHot = if(temperature>50) true else false
    println(isHot)

    val message = "You are ${if(temperature>50) "fried" else "safe"} fish"
    println(message)
}