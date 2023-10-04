package example.myapp
fun buildAquarium() {
    val myAquarium = Aquarium(width =25, length = 25,height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    //default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    //everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()


}
fun main() {
    buildAquarium()
}
