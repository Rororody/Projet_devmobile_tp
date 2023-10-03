//4. Explore defaults values and compact functions
//Create a default value for a parameter

fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun main(args: Array<String>) {
    swim() // uses default speed
    swim("slow") // positional argument
    swim(speed="turtle-like") //named parameter

}