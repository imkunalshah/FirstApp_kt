fun main() {
    var i = 13
    var j = 2

    // Arithmetic Operators

    var sum = i + j
    var difference = i - j
    var product = i * j
    var division = i.toFloat() / j
    var modulo = i % j

    println("Sum: "+ sum)
    println("Difference: "+difference)
    println("Product: "+product)
    println("Division: "+division)
    println("Remainder: "+modulo)

    // Relational Operators

    println(i > j)
    println(i < j)
    println(i == j)
    println(i <= j)
    println(i >= j)
    println(i != j)

    // increment and decrement

    var k = 10
    ++k // k = 1 + k | pre increment
    k++// k = k + 1 | post increment
    println(k)
    var l = 10
    l--// l = l - 1
    println(l)

    var m = 10
    println("Pre increment: "+ ++m)
    var n = 10
    println("Post increment: "+ n++)

    // && Operator

    var above70 = false
    var knowsProgramming = false

    above70 = true
    knowsProgramming = true

    var getsInterviewCall = above70 && knowsProgramming

    println("Gets Interview Call: "+ getsInterviewCall)

    // || Operator

    var isFromIIT = false
    var isGoodInCompetitiveProgramming = false

    //isFromIIT = true
    //isGoodInCompetitiveProgramming = true

    var isSelectedAtGoogle = isFromIIT || isGoodInCompetitiveProgramming

    println("Is Selected At Google: "+isSelectedAtGoogle)

    // ! (Negate) Operator
    var answer = false
    var result = !answer
    println("Result: "+result)
}