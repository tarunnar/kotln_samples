open class Employee {
    var name: String
    var salary: Int
    var age: Int

    constructor(name: String, salary: Int
    , age: Int
    ){
        this.name = name
        this.salary = salary
        this.age = age
    }

    override fun toString(): String {
        return "name = ${this.name} salary: ${this.salary} age=${this.age}"
    }

    open fun work(){    // by default all functions are final cant be overridden
        // if we want to override declare it as open function
        println("Hi")
    }

}

class BackendDeveloper(age: Int, name: String, salary: Int):
    Employee(salary = salary, name = name, age = age) {
    override fun work(){
        print("I am a backend developer")
    }


}

class WebDeveloper(age: Int, name: String, salary: Int):
    Employee(salary = salary, name = name, age = age) {
    override fun work(){
        print("I am a web developer")
    }
}

class AndroidDeveloper(age: Int, name: String, salary: Int):
    Employee(salary = salary, name = name, age = age) {
    override fun work(){
        print("I am a Android developer")
    }
}

fun main(){
    val bed: Employee= BackendDeveloper(name="rajat", age=25, salary = 16)
    println(bed)

    val wed: Employee= WebDeveloper(name="kunji", age=25, salary = 25)
    println(wed)

    val ad: Employee= AndroidDeveloper(name="abhay", age=25, salary = 30)
    println(ad)
}
