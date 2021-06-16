import kotlin.math.pow

fun main() {

    calculateTable(2)
    println("Sum is ${add(1,2)}")
    println("The number 3 is ${EvenOrOdd(3)}")
    printMessage(5)
    printMessage()
    val sum = add(1,2,3)
    println(sum)
    val sum1 = add(1.0,2.5)
    println(sum1)
    val power = power(2.0,3.0)
    println("Power = $power")
}

fun calculateTable(number: Int){
    for (i in 1..10){
        println("$number x $i = ${number * i}")
    }
}

fun add(no1: Int,no2: Int):Int{
    return no1+no2
}

fun EvenOrOdd(number: Int):String{
    if (number%2==0){
        return "even"
    }
    else{
        return "odd"
    }
}

fun printMessage(count: Int = 10){//here = 10 is the default argument
    for (i in 1..count){
        println("Hello $i")
    }
}

fun add(a: Int = 0,b: Int = 0,c: Int = 0): Int{
    return (a+b+c)
}

fun add(a:Double,b:Double):Double{
    return a+b
}

fun power(a: Double,b: Double):Double{
    return a.pow(b)
}