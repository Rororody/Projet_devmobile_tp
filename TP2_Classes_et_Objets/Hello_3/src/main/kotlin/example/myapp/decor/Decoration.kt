//8.Create a data class
//9.Learn about singletons and enums
package example.myapp.decor

import example.myapp.makeFish

data class Decoration(val rocks: String){

}
//Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){

}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
    val decoration2 = Decoration("slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    //Assign all properties to variables
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
    val(rock, wood , diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
fun main () {
    makeDecorations()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}
