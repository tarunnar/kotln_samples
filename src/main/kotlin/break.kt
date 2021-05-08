
fun main(args: Array<String>){
    var i = 0
    outer@ while (i < 5){
        var j = 0
        inner@ while (j <= i){
            if(i >= 3){
                break@inner
            }
            print("@")
            j += 1
        }
        println()
    i+= 1
    }
    println(7.toDouble()/2)
}
