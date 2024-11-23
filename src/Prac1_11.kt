class Matrix(private val rows: Int, private val cols: Int, private val matrix: Array<IntArray>) {

    // Overload the plus (+) operator for matrix addition
    operator fun plus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Overload the minus (-) operator for matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Overload the times (*) operator for matrix multiplication
    operator fun times(other: Matrix): Matrix {
        val result = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j]
                }
            }
        }
        return Matrix(rows, other.cols, result)
    }

    // Overload the toString() function for custom output of the matrix
    override fun toString(): String {
        val builder = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                builder.append("${matrix[i][j]} ")
            }
            builder.append("\n")
        }
        return builder.toString()
    }

    // Function to print matrix with dimensions
    fun printMatrix(label: String) {
        println("$label ($rows x $cols Matrix):")
        println(this.toString())
    }
}

fun main() {
    // Creating matrices for different operations
    val firstMatrix = Matrix(3, 2, arrayOf(
        intArrayOf(6, 3),
        intArrayOf(9, 0),
        intArrayOf(5, 4)
    ))

    val secondMatrix = Matrix(3, 2, arrayOf(
        intArrayOf(2, 3),
        intArrayOf(-9, 0),
        intArrayOf(0, 4)
    ))

    val thirdMatrix = Matrix(2, 3, arrayOf(
        intArrayOf(3, -2, 5),
        intArrayOf(3, 0, 4)
    ))

    val fourthMatrix = Matrix(2, 3, arrayOf(
        intArrayOf(2, 3, 0),
        intArrayOf(-9, 0, 4)
    ))

    // Addition
    println("**************Addition**************")
    firstMatrix.printMatrix("Matrix:1")
    secondMatrix.printMatrix("Matrix:2")
    val additionResult = firstMatrix + secondMatrix
    additionResult.printMatrix("Addition")

    // Subtraction
    println("**************Subtraction**************")
    firstMatrix.printMatrix("Matrix:1")
    secondMatrix.printMatrix("Matrix:2")
    val subtractionResult = firstMatrix - secondMatrix
    subtractionResult.printMatrix("Subtraction")

    // Multiplication
    println("**************Multiplication**************")
    thirdMatrix.printMatrix("Matrix:1")
    fourthMatrix.printMatrix("Matrix:2")
    val multiplicationResult = thirdMatrix * fourthMatrix
    multiplicationResult.printMatrix("Multiplication")
}
