//fun main(){
//    var con = true
//    val arr = ArrayList<Int>()
//    while(con){
//        val no_str = readLine()!!
//        val no_int = no_str.toInt()
//        if(no_int != 42){
//            arr.add(no_int)
//        }
//        else{
//            con = false
//        }
//    }
//    for(i in 0 until arr.size){
//        println(arr.get(i))
//    }
//}
fun main(){
    var con = true

    val no_list = ArrayList<Int>()
    while(con){
        val no_str = readLine()!!
        val no_int = no_str.toInt()
        if(no_int != 42){
           no_list.add(no_int)
        }
        else{
            con = false
        }
    }

    for(i in 0..no_list.size-1){
        println(no_list.get(i))
    }

}