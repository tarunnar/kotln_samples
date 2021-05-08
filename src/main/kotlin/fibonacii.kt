fun fibonacii(num: Int, a: Int, b: Int): Int {
    if(num == 2 )
    {
        return b
    }
    return fibonacii(num-1, b, a+b)
}

fun main(args: Array<String>){
    var a = 1
    var b = 1
    val result = fibonacii(6, a, b)
    println("result , $result")
}

