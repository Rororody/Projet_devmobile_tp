//4.Organize and define constants

//Step 1: Learn about const vs. val

object Constants {
    const val CONSTANT2 = "object constant" // const val ne fonctionne uniquement qu'au debut du code et dans une classe singleton declarée avec object
    val foo = Constants.CONSTANT2
}

//Step 2: Create a companion object

// Nous devons créer une classe avec un companion object contenant un string constant
class MyClass {
    companion object { // companion object initialise le constructeur contenu dans la classe. On l'utilise lorsqu'un object est crée.
        const val CONSTANTS3 = "constant in companion"
    }
}

