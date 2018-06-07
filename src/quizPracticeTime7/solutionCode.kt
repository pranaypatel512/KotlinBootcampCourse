package quizPracticeTime7


/**
 * Created by pRaNaY on 6/7/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/929fc1db-6303-47c6-9d0c-cce02cf77c48

//Basic Task
fun main(args: Array<String>) {
    println("\nYour fortune is: ${getFortune()}")
}

fun getFortune() : String {
    val fortunes = listOf( "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}

//Extra Practice
/*
fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}*/
