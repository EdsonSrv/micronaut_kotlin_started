//Declares a mutable variable and initializing it.
var a: String = "initial"  

//Declares an immutable variable and initializing it. It must be initialized.
val b: Int = 1      

//Declares an immutable variable and initializing it without specifying the type. The compiler infers the type Int.
val c = 3                  

fun main(args: Array<String>) {
    println("$a, $b, $c")    

    val d: Int //Declares a variable without initialization.

    if (true) {//Initializes the variable with different values depending on some condition. 
        d = 1   
    } else {
        d = 2   
    }

    println(d) //Reading the variable is possible because it's already been initialized.
}