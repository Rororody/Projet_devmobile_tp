//5.Get started with filters

fun main(args: Array<String>) {
    //Create a filter
    val decorations = listOf("rock","pagoda","plastic plant","alligator","flowerpot")
    // Show decorations that start with letter P
    println(decorations.filter {it[0] == 'p'})
    //eager, create a new list
    val eager = decorations.filter{ it[0] == 'p'}
    println("eager: $eager")
    //lazy,will wait until asked to evaluate
    val filtered = decorations.asSequence().filter{ it[0] == 'p' }
    println("filtered: $filtered")
    //force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")
    //make a transformation with map()
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    //To print the first element of lazymap using first()
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    //Create a new sequence()

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'} .map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    //create a list Of list by applying the function flatten()
    val mysports = listOf("basketball","fishing","running")
    val myplayers = listOf("LeBron James","Ernest Hemingway","Usain Balt")
    val mycities = listOf("Los Angeles","Chicago","Jamaica")
    val mylist = listOf(mysports,myplayers,mycities)  //list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")

}