//6. Compare abstract classes and interfaces
//How to create abstract classes
//7. The use of interface delegation

package example.myapp

interface FishColor {
    val color: String
}
class Shark(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor

interface FishAction {
    fun eat()
}
object GoldColor : FishColor {
    override val color = "gold"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
