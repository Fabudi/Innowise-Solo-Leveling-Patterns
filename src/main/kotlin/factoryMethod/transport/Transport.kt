package factoryMethod.transport

open class Transport(
    val companyName: String,
    val maxCapacity: Int,
    val maxDimensions: Int
) {
    fun deliver(){
        println("I'm, ${this.javaClass.name}, on my way!" +
                "\n..." +
                "\n..." +
                "\n..." +
                "\nMission completed" +
                "\n+++REP" +
                "\n")
    }
}