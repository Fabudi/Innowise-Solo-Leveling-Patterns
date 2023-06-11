package factoryMethod.transport

class RailwayTransport(
    companyName: String,
    maxCapacity: Int,
    maxDimensions: Int,
    val trackSize: Int,
    val trackType: TrackType
) : Transport(companyName, maxCapacity, maxDimensions) {

}

enum class TrackType{
    BALLASTED,
    UNBALLASTED
}