import java.util.*
import java.util.*  //Required import
//3. Learn more about functions_ Create some functions
//Here we run three different functions which are feedTheFish(), main() and randomDay()

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eats $food")
}
fun main(args: Array<String>) {
    feedTheFish()

}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
return week[Random() .nextInt(week.size)]

}