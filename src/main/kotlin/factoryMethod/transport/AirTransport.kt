package factoryMethod.transport

class AirTransport(
    companyName: String,
    maxCapacity: Int,
    maxDimensions: Int,
    val type: AirDeliveryType,
    val transport: AirCraftType
) : Transport(companyName, maxCapacity, maxDimensions)

enum class AirCraftType {
    PASSENGER, CARGO
}

enum class AirDeliveryType {
    INTRACITY, INTERCITY, INTERNATIONAL
}