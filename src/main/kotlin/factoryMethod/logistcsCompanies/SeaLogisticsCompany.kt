package factoryMethod.logistcsCompanies

import factoryMethod.Config
import factoryMethod.transport.SeaTransport
import factoryMethod.transport.Transport

class SeaLogisticsCompany : LogisticsCompany() {
    override fun createTransport(config: Config): Transport {
        return SeaTransport(
            config.companyName,
            config.maxCapacity,
            config.maxDimensions,
            config.seaType!!)
    }
}