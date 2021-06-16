fun main() {
    var count = 5
    println("\nWhile\n\n")

    while(count>=1){
        println("I am while loop")
        count--
    }

    println("\nMultiplication Tables using while\n\n")

    var no = 40
    var index = 1
    while (index <= 10){
        println(no*index)
        index++
    }

    println("\nDo While\n\n")

    do {
        println("I am do while loop")
    }while (count>1)

    println("\nFor using in\n\n")

    for (i in 1..5){
        println(i)
    }

    println("\nFor using step\n\n")
    for (i in 1..5 step 3){
        println(i)
    }

    println("\nFor using in and until\n\n")
    for (i in 1 until 5){
        println(i)
    }

    println("\nFor using in and downto\n\n")

    for (i in 10 downTo 1){
        println(i)
    }

    println("\nFor using in downto and step\n\n")

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    println("\n Multiplication table using FOr loop\n\n")

    val number = 2
    for (i in 1..10){
        //println(number.toString()+" x "+i+" = "+(number*i))
        //String Templating
        println("$number x $i = ${number * i}")
    }

    var arr = ArrayList<Int>()
}