fun main() {
    var isRaining = true

    if (isRaining){
        println("Take Umbrella")
    }
    else{
        println("Don't take umbrella")
    }

    var x = 13
    var y = 13

    if (x>y){
        println("x > y")
    }
    else if (x < y){
        println("x < y")
    }
    else if (x == y){
        println("x = y")
    }

    var res = if (x>y){
        "x > y"
    }
    else if (x < y){
        "x < y"
    }
    else if (x == y){
        "x = y"
    }
    else{
        "Something is Cheeky"
    }

    println("Result: "+res)

    var alpha = 'C'

    when(alpha){
        'A' -> println("It's A")
        'B' -> println("It's B")
        else -> println("It's Something Else")
    }

    val num = 19;
    val ress = if (num%2 == 0){
        "Even"
    }
    else{
        "Odd"
    }

    println("Even or Odd: "+ress)
}