object Pangrams {

    private val alphabet: List<String> = (0..25).map { (it + 97).toChar().toString() }

    fun isPangram(str: String): Boolean {
        val fold = str
                .toLowerCase()
                .split("")
                .fold(mutableListOf()) { acc: MutableList<String>, curr: String ->
                    if (alphabet.contains(curr) && !acc.contains(curr)) acc.add(curr)
                    acc
                }
        return fold.size == 26
    }
}