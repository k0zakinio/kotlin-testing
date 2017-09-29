class Squares(val ceiling: Int) {
    fun squareOfSum(): Int {
        val sum = (1..ceiling).sum().toDouble()
        return Math.pow(sum, 2.0).toInt()
    }

    fun sumOfSquares(): Int {
        return (1..ceiling).fold(0) { acc, curr -> acc + Math.pow(curr.toDouble(), 2.0).toInt() }
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

}