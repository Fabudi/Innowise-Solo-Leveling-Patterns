import builder.Coffee
import builder.CoffeeWithBuilder
import facade.ApiManager
import facade.CacheManager
import facade.UserManager
import factoryMethod.Config
import factoryMethod.Country
import factoryMethod.logistcsCompanies.AirLogisticsCompany
import factoryMethod.logistcsCompanies.CarLogisticsCompany
import factoryMethod.logistcsCompanies.RailwayLogisticsCompany
import factoryMethod.logistcsCompanies.SeaLogisticsCompany
import singleton.Sun

fun main() {
    facadePreview()
    factoryMethodPreview()
    builderPreview()
    singletonPreview()
}

fun facadePreview() {
    val userManager = UserManager(CacheManager, ApiManager)
    println(userManager.getUser(0))
    println(userManager.getUser(0))
    println(userManager.getUser(0))
    println(userManager.getUser(1))
    println(userManager.getUser(1))
}

fun factoryMethodPreview() {
    val config = Config(
        country = Country.BELARUS,
        companyName = "ABC.Delivery",
        maxCapacity = 100,
        maxDimensions = 2500
    )

    val transport = when (config.country) {
        Country.BELARUS -> { CarLogisticsCompany().createTransport(config) }
        Country.USA -> { SeaLogisticsCompany().createTransport(config) }
        Country.GERMANY -> { AirLogisticsCompany().createTransport(config) }
        Country.RUSSIA -> { RailwayLogisticsCompany().createTransport(config) }
    }

    transport.deliver()

}

fun singletonPreview() {
    Sun.printAddress()
    Sun.printAddress()
}

fun builderPreview() {
    println(Coffee(isDoubleCoffee = true, hasCinnamon = true, hasMilk = true))
    println(Coffee(hasCinnamon = true, hasSugar = true, hasMilk = true))
    println(Coffee(isDoubleCoffee = true, hasCream = true, hasSyrup = true))
    val builder = CoffeeWithBuilder.Builder()
    builder.setCinnamon()
    builder.setMilk()
    builder.setDoubleCoffee()
    println(builder.build())
}