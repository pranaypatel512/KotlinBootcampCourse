package randomday6

import java.util.*

/**
 * Created by pRaNaY on 6/2/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/7f416b59-dfec-4798-89d9-e65a7f954d69
fun main(args: Array<String>) {
//    println("Hello,${args[0]}!")
    feedTheFish()
}

fun feedTheFish() {
//    val day = "Tuesday"
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food ")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}
