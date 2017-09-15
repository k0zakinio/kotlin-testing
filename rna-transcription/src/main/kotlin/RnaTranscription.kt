fun transcribeToRna(dna: String): String {
    return dna
            .split("")
            .fold("") { acc, curr -> acc + transcribe(curr) }
}

fun transcribe(chr: String): String {
    return when (chr) {
        "C" -> "G"
        "T" -> "A"
        "A" -> "U"
        "G" -> "C"
        else -> ""
    }
}
