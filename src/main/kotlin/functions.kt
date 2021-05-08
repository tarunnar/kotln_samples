fun sum(arr: MutableList<String>, s: Int = 9): Long {
    var sum = 0
    for(c in 0 .. arr.lastIndex){
        sum += arr[c].toInt()
    }
    arr.add("79")
    println(System.identityHashCode(arr))

    println("s $s")
    println(System.identityHashCode(s))
    return sum.toLong()
}

fun main(args: Array<String>){
    var argument_list = args.toMutableList()
    println(System.identityHashCode(argument_list))
    var s = 9
    val res = sum(s = s, arr = argument_list)
    for (i in 0 .. argument_list.lastIndex){
        println(argument_list[i])   // objects are passed by reference in kotlin
    }
    println("res, $res")
}