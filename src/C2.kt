fun main(){
    val am = readLine()!!
    val am_i = am.toInt()
    val bal = readLine()!!
    val bal_i = bal.toDouble()
    var net = 0.0
    if(bal_i > 2000 || bal_i <=0){
        println("Error")
    }
    else if(am_i >= bal_i || am_i <= 0){
        println("Error")
    }
    else if(am_i % 5 !=0 ){
        net = (bal_i).toDouble()
        println(net)
    }
    else{
        net = (bal_i - am_i - 0.5).toDouble()
        println(net)
    }

}