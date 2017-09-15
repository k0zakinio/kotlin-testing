fun hello(name: String = "World"): String {
    return when {
        name.trim().isEmpty() -> "Hello, World!"
        else -> "Hello, $name!"
    }
}
