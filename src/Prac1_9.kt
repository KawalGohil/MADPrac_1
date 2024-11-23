package Practicals.src

fun main() {
    // Create an ArrayList of integers
    val numbers = arrayListOf(10, 20, 5, 35, 50, 15)
    println(numbers)
    // Find the maximum number using maxOrNull()
    val maxNumber = numbers.maxOrNull()

    // Print the result
    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}
