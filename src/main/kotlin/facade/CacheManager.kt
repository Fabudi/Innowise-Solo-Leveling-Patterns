package facade

object CacheManager {
    val cacheData = HashMap<Long, User>()

    fun addUser(user: User){
        if(!cacheData.containsKey(user.id)) cacheData[user.id] = user
    }

    fun deleteUser(user: User){
        if(cacheData.containsKey(user.id)) cacheData.remove(user.id)
    }

    fun updateUser(user: User){
        if(cacheData.containsKey(user.id)) cacheData[user.id] = user
    }

    fun getUser(id: Long): User?{
        println("Access to Cache...\n" +
                "Retrieving User data...")
        return if(cacheData.containsKey(id)) cacheData[id] else {
            println("Error 404")
            null
        }
    }

}