object Hamming {
    fun compute(a: String, b: String): Int {
        if(a.length != b.length) throw IllegalArgumentException("leftStrand and rightStrand must be of equal length.")
        return (0..(a.length - 1)).count { a[it] != b[it] }
    }
}