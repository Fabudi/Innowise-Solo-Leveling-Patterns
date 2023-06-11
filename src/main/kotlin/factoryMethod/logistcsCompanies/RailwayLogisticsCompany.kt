package factoryMethod.logistcsCompanies

import factoryMethod.Config
import factoryMethod.transport.RailwayTransport
import factoryMethod.transport.Transport

class RailwayLogisticsCompany : LogisticsCompany()  {
    override fun createTransport(config: Config): Transport {
        return RailwayTransport(
            config.companyName,
            config.maxCapacity,
            config.maxDimensions,
            config.trackSize!!,
            config.trackType!!)
    }
}