fun fatorial(num: Int, res: Int): Int {
    println("$num $res")
    if(num == 1){
        return res
    }
    return fatorial(num-1, res * num)

}
fun main(args: Array<String>){
    var res = 1
    val result = fatorial(6, res)
    println("result , $result")
}