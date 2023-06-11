package factoryMethod.logistcsCompanies

import factoryMethod.Config
import factoryMethod.transport.CarTransport
import factoryMethod.transport.Transport

class CarLogisticsCompany : LogisticsCompany()  {
    override fun createTransport(config: Config): Transport {
        return CarTransport(
            config.companyName,
            config.maxCapacity,
            config.maxDimensions
        )
    }
}