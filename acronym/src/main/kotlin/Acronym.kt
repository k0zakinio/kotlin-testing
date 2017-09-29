object Acronym {
    private val CAMEL_CASE_REGEX = "(?<=[a-z])(?=\\p{Upper})".toRegex()
    private val SEPERATOR_REGEX = "[\\s-]".toRegex()

    fun generate(str: String): String {
        return str.split(SEPERATOR_REGEX).fold("") { acc, curr ->
            val split = curr.split(CAMEL_CASE_REGEX)
            val fold: String = split.fold("") { a, c -> a + c[0].toUpperCase() }
            acc + fold
        }
    }
}