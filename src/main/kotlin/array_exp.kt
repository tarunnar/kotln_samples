import com.sun.jdi.IntegerValue

fun main(args: Array<String>){
    val arr = arrayOf(10, 12, 15, 17)
    for(i in 0 .. arr.size-1){
        println(arr[i])
    }
    arr.plus(5)

    var arr2 = arr.toMutableList()
    arr2.add(8)
    for(i in 0 .. arr2.size-1){
        println(arr2[i])
    }
    arr2.get(2)
}