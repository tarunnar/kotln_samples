fun main(x: Array<String>) {
    var sample = listOf<Int>(5, 7, 9, 2 , 8, 10, 9, 9, 6, 5, 6, 6)
    var frequency = hashMapOf<Int, Int>()

    for(i in 0 .. sample.lastIndex){
        frequency[sample[i]] = frequency.getOrDefault(sample[i], 0) + 1
    }

    for (key in frequency.keys){
        println("key ${key}, ${frequency[key]}")
    }


    var set1 = setOf<Int>(1, 3, 5, 7, 8, 9, 5);
    var set2 = setOf<Int>(6, 3, 5, 6, 7, 8, 11, 15)
    var intersection = set1.intersect(set2)
    var union = set1.union(set2)
    var difference = set2.minus(set1)

    println("intersection is ================")

    for(item in intersection){
        println("$item")
    }

    println("union is ================")

    for(item in union){
        println("$item")
    }

    println("difference is ================")

    for(item in difference){
        println("$item")
    }

    if (difference.isEmpty()){
        println("no difference")
    }

}