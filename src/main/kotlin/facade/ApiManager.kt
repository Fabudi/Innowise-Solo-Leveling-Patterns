package facade

object ApiManager {
    fun getUser(id: Long): User{
        println("Access to API...\n" +
                "Retrieving User data...")
        return User(id, "SoMeStRaNgEnIcKnAmE1337XXX")
    }
}