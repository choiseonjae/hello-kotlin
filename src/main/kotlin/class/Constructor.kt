package `class`

class Constructor(val name: String, var age: Int){

}

class Constructor2(name: String){
    val name = name.toUpperCase()
}

class Contructor3(name: String){
    val name = name.toLowerCase()
    var age: Int = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}

class Constructor4 {
    constructor() {
        println("Call constructor")
    }

    init {
        println("Call init")
    }
}

fun main(args: Array<String>){
    val constructor = Constructor("Kakaopay", 9)
    println("constructor name is ${constructor.name} and age is ${constructor.age}")

    val constructor2 = Constructor2("Kakao")
    println("constructor2 name is ${constructor2.name}")

    val contructor3 = Contructor3("Naver", 10)
    println("constructor3 name is ${contructor3.name} and age is ${contructor3.age}")

    val constructor4 = Constructor4()
}
