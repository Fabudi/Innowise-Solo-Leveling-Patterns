package builder

class Coffee(
    val isDoubleCoffee: Boolean = false,
    val hasMilk: Boolean = false,
    val hasCream: Boolean = false,
    val hasSugar: Boolean = false,
    val hasCinnamon: Boolean = false,
    val hasSyrup: Boolean = false
) {
    override fun toString(): String {
        return "builder.Coffee:\n" +
                "Double:   $isDoubleCoffee\n" +
                "Milk:     $hasMilk\n" +
                "Cream:    $hasCream\n" +
                "Sugar:    $hasSugar\n" +
                "Cinnamon: $hasCinnamon\n" +
                "Syrup:    $hasSyrup\n"
    }
}