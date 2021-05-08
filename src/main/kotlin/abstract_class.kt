abstract class  abs{
    abstract fun calculate(a: Int, b: Int): Int
}

class Add: abs(){
    override fun calculate(a: Int, b: Int): Int {
        return a + b
    }
}

class Sub: abs(){
    override fun calculate(a: Int, b: Int): Int {
        return a - b
    }
}

class Mul: abs(){
    override fun calculate(a: Int, b: Int): Int {
        return a * b
    }
}

fun main(){
    val res1 = Add().calculate(2,5)
    val res2 = Sub().calculate(2,5)
    val res3 = Mul().calculate(2,5)

    println("res1 = ${res1} res2 = ${res2} res3 = ${res3}")
}