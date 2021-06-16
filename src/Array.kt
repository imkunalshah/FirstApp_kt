import java.util.*

fun main() {
    println("Here's Array of Int\n")
    var arr:Array<Int> = arrayOf(1,2,3)

    println("Printing array list\n\n")
    for (i in 0 until arr.size){
        println("Item $i of the array is ${arr.get(i)}")
    }
    // or
    println("\nPrinting arry list using indices\n\n")
    for (i in arr.indices){
        println("Item $i of the array is ${arr.get(i)}")
    }
    println("Length of array is : ${arr.size}")

    val scanner = Scanner(System.`in`)
    println("Here's Array Using Reading User Input\n")


    println("**[Please Enter List Size]**")

    val size = scanner.nextInt()

    var arr1 = IntArray(size)
    //var arr1:Array<String> = Array(size)

    for (i in arr1.indices){
        println("Enter No ${i+1} ")
        val item = scanner.nextInt()
        arr1.set(i,item)
    }

    println("\nThe Array Is : \n")

    for (i in arr1.indices){
        println("Item ${i+1} = ${arr1.get(i)}")
    }

    println("\nArray - Reading User Input[String]\n\n")

    println("Enter No Of Names :")

    val nameSize = scanner.nextInt()

    var nameArr = arrayOfNulls<String>(nameSize)

    for (i in nameArr.indices){
        println("Enter name ${i+1}")
        val name = readLine()!!
        //nameArr.set(i,name)
        // or
        nameArr[i] = name
    }

    println("The List Of Names Is: ")

    for (i in nameArr.indices){
        println("Name ${i+1} : ${nameArr.get(i)}")
    }
}