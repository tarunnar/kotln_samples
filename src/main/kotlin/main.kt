fun main(args: Array<String>) {
    println("@@@@ Hello World!")
    var x = 5
    val y = 5
    println(x==y)
    for (i in args.size -1 downTo 0){
        println("${i} ${args[i]}")
    }
}