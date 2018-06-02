package ExerciseGreetingsKotlin

/**
 * Create a main() function that takes an argument representing the time in 24-hour format (values between and including 0 -> 23).

In the main() function, check if the time is before midday (<12), then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".
 */
//Link: https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/4e7dd6df-9713-4a05-9d99-959854ecea6e
fun main(args:Array<String>){
    //Way one
    if (args[0].toInt() < 12) println("Good Morning Kotlin")
    else println("Good Night Kotlin" )

    //Way two
    println(if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin")
}


