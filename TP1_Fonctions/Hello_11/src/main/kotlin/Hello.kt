//6.Get started with lambdas and higher order functions

fun main(args: Array<String>) {
    var dirtyLevel = 19
    val waterFilter: (Int) -> Int = {dirty -> dirty /2}
    dirtyLevel = updateDirty(dirtyLevel) {dirtyLevel -> dirtyLevel + 23}
    println(updateDirty(dirtyLevel, waterFilter))
    println(updateDirty(30,waterFilter))
    //println(waterFilter(dirtyLevel))
    println(updateDirty(15, ::increaseDirty))
    println(dirtyLevel)
}
fun updateDirty (dirty: Int, operation: (Int) -> Int): Int{

    return operation(dirty)
}
fun increaseDirty (start: Int) = start + 1
