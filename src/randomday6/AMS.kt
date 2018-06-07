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
//    val food = "pellets"
    val food = fishFood(day)
    println("Today is $day and the fish eat $food ")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"
    /*when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }*/
    //return food
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}


//https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/995d3da0-8889-486e-af0a-cd357b6d3b20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    //Way One
    /*return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }*/

    //Way Two
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"