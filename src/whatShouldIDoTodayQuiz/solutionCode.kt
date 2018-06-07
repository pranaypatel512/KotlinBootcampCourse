package whatShouldIDoTodayQuiz


/**
 * Created by pRaNaY on 6/7/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/72e40b2d-c3e6-499b-bbb2-d7562b54e89f

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood:String,weather:String ="Sunny",temperature:Int=24):String{
    return when {
        mood=="happy" && weather=="Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }

}
