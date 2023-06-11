package factoryMethod.logistcsCompanies

import factoryMethod.Config
import factoryMethod.transport.AirTransport
import factoryMethod.transport.Transport

class AirLogisticsCompany : LogisticsCompany() {
    override fun createTransport(config: Config): Transport {
        return AirTransport(
            config.companyName,
            config.maxCapacity,
            config.maxDimensions,
            config.airDeliveryType!!,
            config.airCraftType!!
        )
    }
}