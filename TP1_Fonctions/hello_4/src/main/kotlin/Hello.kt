//Learn why almost everything has a value
//While running, the code we need to have the answer "The water temperature is OK."

fun main(args: Array<String>) {
    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50)  "too warm" else "OK" }."
    println(message)
}