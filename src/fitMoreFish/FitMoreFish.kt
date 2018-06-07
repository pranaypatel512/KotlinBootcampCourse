package fitMoreFish

/**
 * Created by pRaNaY on 6/7/2018.
 */
//Lesson : https://classroom.udacity.com/courses/ud9011/lessons/14fb1ae9-8a2e-48ee-9620-68c87c5f833b/concepts/bfce2969-9881-4da5-a2c7-dfeae8c220fa
fun main(args: Array<String>) {
    canAddFish(10.0, listOf(3, 3, 3))
    canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false)
    canAddFish(9.0, listOf(1, 1, 3), 3)
    canAddFish(10.0, listOf(), 7, true)
    val nums = listOf<Long>(-2, -1, 1, 2, 3, 4)
    println(nums.sum())
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}