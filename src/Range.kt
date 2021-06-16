fun main() {
    var number = 5
    var result = number in 1..5 // number in 1 until 5
    var ress = number in 1 until 5
    println("Until: "+ress)
    println("Number in between 1 to 5: "+result)

    var name = "C"

    var res =
        when(name){
            "A" -> "A"
            "B" -> "B"
            "C" -> "C"
            "D" -> "D"
            "E" -> "E"
            "F" -> "F"
            else -> "Not Found"
        }

    println("Name is "+res)

    var no = 12
    var rees =
        when(no){
            in 1..5 -> "In Between 1 - 5"
            in 5..10 -> "In Between 5 - 10"
            else -> "Not in range"
        }

    println(rees)
}
