object Acronym {
    fun generate(str: String): String {
        return str.split("[\\s-]".toRegex()).fold("") { acc, curr ->
            val split = curr.split("(?=[a-z]\\p{Upper})".toRegex())
            val fold: String = split.fold("") { a, c -> a + c[0].toUpperCase() }
            println("curr: $curr")
            println("acc: $acc")
            println("split: $split")
            acc + fold
        }
    }
}