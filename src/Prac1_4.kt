    fun main(){
    print("Enter a num: ")
    val x = readln()!!.toInt()   //Checking if the value is null or not
    when(x%2){
        0 -> println("$x is Even!")
        1 -> println("$x is Odd!")
    }
    if (x%2 == 0){
        "$x is Even!"
    }
    else{
        "$x is Odd!"
    }
}