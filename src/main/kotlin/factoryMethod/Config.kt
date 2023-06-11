package factoryMethod

import factoryMethod.transport.AirCraftType
import factoryMethod.transport.AirDeliveryType
import factoryMethod.transport.SeaDeliveryType
import factoryMethod.transport.TrackType

data class Config(
    val country: Country,
    val companyName: String,
    val maxCapacity: Int = 100,
    val maxDimensions: Int = 2500,
    val seaType: SeaDeliveryType? = null,
    val airCraftType: AirCraftType? = null,
    val airDeliveryType: AirDeliveryType? = null,
    val trackSize: Int? = null,
    val trackType: TrackType? = null
)
