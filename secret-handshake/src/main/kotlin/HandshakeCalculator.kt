object HandshakeCalculator {
    fun calculateHandshake(num: Int): List<Signal> {
        val binaryString = num.toBinary()
        val shouldReverse = binaryString.length == 5 && binaryString.last() == '1'
        val foldIndexed = binaryString.reversed().foldIndexed<MutableList<Signal>>(mutableListOf()) { index, acc, curr ->
            when (index to curr) {
                Pair(0, '1') -> addSignalToList(Signal.WINK, acc)
                Pair(1, '1') -> addSignalToList(Signal.DOUBLE_BLINK, acc)
                Pair(2, '1') -> addSignalToList(Signal.CLOSE_YOUR_EYES, acc)
                Pair(3, '1') -> addSignalToList(Signal.JUMP, acc)
                else -> acc
            }
        }
        return if(shouldReverse) foldIndexed.reversed() else foldIndexed
    }

    private fun Int.toBinary(): String {
        return this.toString(2)
    }

    private fun addSignalToList(signal: Signal, list: MutableList<Signal>): MutableList<Signal> {
        list.add(signal)
        return list
    }

}
