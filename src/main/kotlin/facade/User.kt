package facade

class User(val id: Long, val nickname: String) {
    override fun toString(): String {
        return "User(id=$id, nickname='$nickname')\n"
    }
}