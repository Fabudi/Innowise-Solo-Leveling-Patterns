package factoryMethod.transport

class SeaTransport(
    companyName: String,
    maxCapacity: Int,
    maxDimensions: Int,
    val type: SeaDeliveryType
) : Transport(companyName, maxCapacity, maxDimensions) {

}

enum class SeaDeliveryType {
    RIVER,
    SEA
}