package Practicals.src

fun main(){
    var ar1 = arrayOf(1,2,3,4,5,6)
    println(ar1.contentDeepToString())
    var ar2 = Array<Int>(5){0}
    println(ar2.contentDeepToString())
    val ar3 = Array<Int>(5){inx -> inx+1}
    println(ar3.contentDeepToString())
    var ar4 = IntArray(5){0}
    println(ar4.joinToString())
    var ar5 = intArrayOf(1,3,5,2,7)
    println(ar5.joinToString())
    var ar6 = arrayOf(intArrayOf(1,5), intArrayOf(5,3))
    println(ar6.contentDeepToString())
    val intArray = intArrayOf(50, 30, 40, 10, 20)
    bubbleSort(intArray)
    println("Sorted array without built-in function: ${intArray.joinToString()}")
    intArray.sort()
    println("Sorted array with built-in function: ${intArray.joinToString()}")
}
fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}


