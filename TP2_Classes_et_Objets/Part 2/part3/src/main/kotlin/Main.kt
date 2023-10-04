//3.Learn more about collections

//Step 1: Understand more about lists
fun main(){
    //nous devons creer une liste de nombres et l'appeler dans une function sum() qui a pour role de les additionner.
    val list = listOf(1, 5, 3, 4)
    println(list.sum())  // afficher la somme de tous les nombres presents dans la liste declarée

    //Creation d'une liste de caratère et faire la somme de tous les caractères à l'aide de la fonction sum()
    //val list2 = listOf("a", "bbb", "cc")
    //println(list2.sum()) // Nous avons une erreur qui survient car la function sum() telle qu'elle est definit ne reconnait pas les valeurs String
    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length }) // ici nous avons un resultat car nous avons ajouter un parametre qui permet de bien préciser une propiété des caractères

    //choisir les élémentsprésents dans la list a travers la fonction listIterator()
    for(s in list2.listIterator()) { //pour tous les éléments de la liste ("a", "bbb", "cc")
        println("$s") // Afficher les éléments separament.
    }
//Step 2: Try out hash maps
    //Hash maps est une forme d'utilisation des structures de données. Elle permet de conserver une valeur et un objet second qu'on a utilisé pour referencer la valeur conservée

    //Nous devons créer un hash map qui lie les common fish names et les scientific name de ses fish
    val scientific = hashMapOf("guppy" to "poecilia reticulata","catfish" to "corydoras","zebra fish" to "danio rerio")
    println(scientific.get("guppy")) // ici nous avons poecilia reticulata qui s'affiche
    println(scientific.get("zebra fish")) // Ici nous avons danio rerio qui s'affiche
    println(scientific.get("swordtail")) // Ici nous avons le resultat null car il y'a aucun nom scientifique qui correspond à swordtail

    // Nous devons utiliser la fonction getOrDefault() qui permet de ne plus renvoyer null mais un message particulier
    println(scientific.getOrDefault("swordtail", "sorry,i don't know"))

    //Changer le code en utilisant getOrElse() à la place de get0rDefault()
    println(scientific.getOrElse("swordtail") {"sorry, i don't know"})

}