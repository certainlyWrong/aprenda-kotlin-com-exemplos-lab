package models.user

enum class Level {
    JUNIOR,
    PLENO,
    SENIOR
}

data class User(
        val name: String,
        val lastName: String,
        val email: String,
        val password: String,
        val level: Level
) {
    override fun toString(): String {
        return "User(name='$name', lastName='$lastName', email='$email', password='$password', level=$level)"
    }
}
