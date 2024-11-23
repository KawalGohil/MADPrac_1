fun main(){
    println("Enter a Number:")
    val x = readln().toInt()
    println("The factorial of $x is: "+Fac(x))
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is: $result")
}
fun Fac(a:Int):Int{
    if (a<=1){
        return 1
    }
    else{
        return a*Fac(a-1)
    }
}
tailrec fun factorial(n: Int, result: Long = 1): Long {
    return if (n == 1) {
        result
    } else {
        factorial(n - 1, result * n)
    }
}
