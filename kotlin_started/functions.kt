//Unit -> (no return value)
fun printMessage(message: String): Unit {                               
    println(message)
}

//optional parameter with default value Info. 
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  
    println("[$prefix] $message")
}

//Returns integer
fun sum(x: Int, y: Int): Int {                                          
    return x + y
}

//A single-expression function that returns an integer (inferred).
fun multiply(x: Int, y: Int) = x * y                                    

//The vararg modifier turns a parameter into a vararg.
fun printAll(vararg messages: String) {                            
    for (m in messages) println(m)
}

//you can even add another parameter of the same type after the vararg. 
fun printAllWithPrefix(vararg messages: String, prefix: String) {  
    for (m in messages) println(prefix + m)
}

fun main() {

    printMessage("Hello")                                                               
    printMessageWithPrefix("Hello", "Log")                              
    printMessageWithPrefix("Hello")                                     
    printMessageWithPrefix(prefix = "Log", message = "Hello")           
    println(sum(1, 2))
    println(multiply(5,5))

    //This allows calling printAll with any number of string arguments.
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")   

    //Using named parameters, you can set a value to prefix separately from the vararg.
    printAllWithPrefix(
    "Hello", "Hallo", "Salut", "Hola", "你好",
    prefix = "Greeting: ")

}