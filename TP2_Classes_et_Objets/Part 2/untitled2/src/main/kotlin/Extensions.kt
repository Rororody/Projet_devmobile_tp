//5.Understand extension functions

//Step 1: Write an extension function
fun String.hasSpaces(): Boolean { // Ici nous avons la fonction hasSpaces() qui a pour préfixe la classe String
    val found = this.indexOf("")
    return found != -1 // Nous retournons -1 car la valeur de found n'est pas definit
   // fun String.hasSpaces() = indexOf("") != -1 Ceci est la version simplifiée de la fonction definit plus haut
}

//Step 2: Learn the limitations of extensions

//Ajoutons une extension de fonction qui appelle la propriété private
//class AquariumPlant(val color: String, private val size: Int)
//fun AquariumPlant.isRed() = color == "red"
//fun AquariumPlant.isBig() = size > 50 // Ici nous avons une erreur car size est privé dans la classe
open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int) : AquariumPlant("green",size)
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

//Step 3: Add an extension property

//Ajouter une propriété isGreen dans AquariumPlant
val AquariumPlant.isGreen: Boolean
    get() = color == "green"


fun main(){
    val plant = GreenLeafyPlant(size = 10)
    println(plant)
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
    print(aquariumPlant.isGreen)
}
//Step 4: Know about nullable receivers

fun AquariumPlant?.pull(){
    this?.apply {
        println("removing $this")
    }
    plant.pull()
}
val plant: AquariumPlant? = null
