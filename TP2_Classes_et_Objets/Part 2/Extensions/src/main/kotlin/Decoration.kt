//1.Create a companion Object

//Exemple of a companion Object
class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}
fun main() {
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}
// Ici nous avons créée une classe Choice à l'intereieure de laquelle nous avons mis un object Kotlin.Elle prend en parametre le nom du Choice.Ensuite, nous entrons une fonction qui prendf en parametre un nom et affiche my favourite + nom.