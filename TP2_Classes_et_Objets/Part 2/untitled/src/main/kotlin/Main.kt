//2.Learn about pairs and triples


fun main(){
//Step1: Make some pairs and triples

    // Nous devons creer une paire ou asociation de 2 equipements ayant des expressions ou des valeurs differentes eet l'afficher à la fin.
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    //Nous devons creer un triplet en convertissant les valeurs entrées dans la fonction toString() en une liste toList() contenant 3 éléments
    val numbers = Triple(6,9,42)
    println(numbers.toString())
    println(numbers.toList())

    //nous devons créer une paire où la première partie est elle meme une paire
    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n") //ici on affiche la paire finale et on va à la ligne
    println("${equipment2.first.second}") // Ici on affiche le deuxieme élément de la premiere paire

//Step2: destructure some pairs and triples
//Cette partie consiste à separer les paires et les triplets en singleton.

    val (tool, use) = equipment // ici à tool qui est le premier élément et use le second de la paire, on affecte les valeurs respectives de equipement declarées plus haut.
    println("$tool is used for $use") // dans l'affichage tool prend la valeur fish net et use: catching fish. On obtient donc la phrase fish net is used for catching fish.

    val(n1, n2, n3) = numbers // on affecte respectivement à chaque valeur du triplet les valeurs n1,n2 et n3
    println("$n1 $n2 $n3") // ici on affiche les éléments individuellement.Du coup, cela ne s'affiche plus comme un ensemble ou une liste.
}

