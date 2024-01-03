fun main() {
    val numbersList: List<Int> = listOf(1, 2, 3, 4,)
    println("Immutable List: $numbersList")

    val uniqueNumbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    println("Immutable Set: $uniqueNumbersSet")

    val fruitPrices: Map<String, Double> = mapOf("apple" to 1.0, "banana" to 0.75, "orange" to 1.5)
    println("Immutable Map: $fruitPrices")

    val mutableNumbersList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    mutableNumbersList.add(6)
    println("Mutable List: $mutableNumbersList")

    val mutableUniqueNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    mutableUniqueNumbersSet.add(6)
    println("Mutable Set: $mutableUniqueNumbersSet")

    val mutableFruitPrices: MutableMap<String, Double> = mutableMapOf("apple" to 1.0, "banana" to 0.75)
    mutableFruitPrices["orange"] = 1.5
    println("Mutable Map: $mutableFruitPrices")
}
