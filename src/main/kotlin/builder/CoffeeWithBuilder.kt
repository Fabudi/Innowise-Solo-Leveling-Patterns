package builder

class CoffeeWithBuilder private constructor(
    val isDoubleCoffee: Boolean?,
    val hasMilk: Boolean?,
    val hasCream: Boolean?,
    val hasSugar: Boolean?,
    val hasCinnamon: Boolean?,
    val hasSyrup: Boolean?
) {
    data class Builder(
        var isDoubleCoffee: Boolean = false,
        var hasMilk: Boolean = false,
        var hasCream: Boolean = false,
        var hasSugar: Boolean = false,
        var hasCinnamon: Boolean = false,
        var hasSyrup: Boolean = false
    ) {
        fun setDoubleCoffee() = apply { this.isDoubleCoffee = true }
        fun setMilk() = apply { this.hasMilk = true }
        fun setCream() = apply { this.hasCream = true }
        fun setSugar() = apply { this.hasSugar = true }
        fun setCinnamon() = apply { this.hasCinnamon = true }
        fun setSyrup() = apply { this.hasSyrup = true }
        fun build() = CoffeeWithBuilder(isDoubleCoffee, hasMilk, hasCream, hasSugar, hasCinnamon, hasSyrup)
    }
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