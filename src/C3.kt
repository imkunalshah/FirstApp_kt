//fun main(){
//    val t_case = readLine()!!
//    val t_case_i = t_case.toInt()
//
//    var c_hash = HashMap<Int,Array<String>>(t_case_i)
//    for(i in 1..t_case_i){
//        val inp = readLine()!!
//        val inp_arr = inp.split(" ").toTypedArray()
//        c_hash.put(i,inp_arr)
//    }
//
//    for(i in 1..c_hash.size){
//        val no_arr = c_hash.get(i)
//        val no_1 = no_arr?.get(0)
//        val no_2 = no_arr?.get(1)
//        val no_1_i = Integer.parseInt(no_1)
//        val no_2_i = Integer.parseInt(no_2)
//        if(no_2_i > no_1_i){
//            println(0)
//        }
//        else{
//            val res = no_1_i/no_2_i
//            println(res)
//        }
//    }
//}
fun main() {
    val t_case = readLine()?.toInt() ?: 0
    //val t_case_i = t_case.toInt()

    var c_hash = HashMap<Int, Array<String>>(t_case)
    for (i in 1..t_case) {
        val inp = readLine() ?: ""
        val inp_arr = inp.split(" ").toTypedArray()
        c_hash.put(i, inp_arr)
    }

    for (i in 1..c_hash.size) {
        val no_arr = c_hash.get(i)
        val no_1 = no_arr?.get(0)
        val no_2 = no_arr?.get(1)
        val no_1_i = Integer.parseInt(no_1)
        val no_2_i = Integer.parseInt(no_2)
        if (no_2_i > no_1_i) {
            println(0)
        } else {
            val res = no_1_i / no_2_i
            println(res)
        }

    }
}