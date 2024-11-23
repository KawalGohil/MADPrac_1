fun arithmeticOperation(num1: Double, num2: Double, operation: String): Double {
    return when (operation) {
        "add" -> num1 + num2
        "subtract" -> num1 - num2
        "multiply" -> num1 * num2
        "divide" -> {
            if (num2 != 0.0) num1 / num2
            else throw IllegalArgumentException("Division by zero is not allowed")
        }
        else -> throw IllegalArgumentException("Invalid operation")
    }
}

fun main() {
    val num1 = 10.0
    val num2 = 5.0

    println("Addition: ${arithmeticOperation(num1, num2, "add")}")
    println("Subtraction: ${arithmeticOperation(num1, num2, "subtract")}")
    println("Multiplication: ${arithmeticOperation(num1, num2, "multiply")}")
    println("Division: ${arithmeticOperation(num1, num2, "divide")}")
}
