package quizPracticeTimeFilter17


/**
 * Created by pRaNaY on 6/8/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/d589788f-ff1e-4ffd-bba0-11053d6a452f

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    //Sorting curries by string length
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //Filtering by those that start with 'c' and end with 'e'
    spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}

    //Filtering the first 3 items by 'c'
    println(spices.filter{it.startsWith('c')}.filter{it.endsWith('e')})

}

