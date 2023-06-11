package factoryMethod.logistcsCompanies

import factoryMethod.Config
import factoryMethod.transport.Transport

abstract class LogisticsCompany {
    abstract fun createTransport(config: Config): Transport
}