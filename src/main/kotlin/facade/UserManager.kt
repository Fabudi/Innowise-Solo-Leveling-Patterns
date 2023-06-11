package facade

class UserManager(
    private val cacheManager: CacheManager,
    private val apiManager: ApiManager
) {
    fun getUser(id: Long): User {
        var user = cacheManager.getUser(id)
        if (user != null) return user
        user = apiManager.getUser(id)
        cacheManager.addUser(user)
        return user
    }
}