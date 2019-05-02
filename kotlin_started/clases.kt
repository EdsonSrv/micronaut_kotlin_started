//Declares a class named Customer without any properties or user-defined constructors. 
//A non-parameterized default constructor is created by Kotlin automatically.
class Customer 

//Declares a class with two properties: immutable id and mutable email, 
//and a constructor with two parameters id and email.
class Contact(val id: Int, var email: String)   

fun main() {
    //Creates an instance of the class Customer via the default constructor.
    val customer = Customer()                   
    
    val contact = Contact(1, "mary@gmail.com")  

    //Accesses the property id.
    println(contact.id)                         
    contact.email = "jane@gmail.com"            
}