object HandshakeCalculator {
    fun calculateHandshake(num: Int) =
            num
            .createReversedBinaryString()
            .workOutHandshake()
            .reverseHandShakeSequence(num.toString(2))

    private fun String.workOutHandshake() = this.foldIndexed(listOf<Signal>(), { index, acc, curr ->
        acc.plus(when (index to curr) {
            Pair(0, '1') -> Signal.WINK
            Pair(1, '1') -> Signal.DOUBLE_BLINK
            Pair(2, '1') -> Signal.CLOSE_YOUR_EYES
            Pair(3, '1') -> Signal.JUMP
            else -> null
        }).filterNotNull()
    })

    private fun List<Signal>.reverseHandShakeSequence(num: String) =
            if (num.length == 5 && num.first() == '1') reversed() else this

    private fun Int.createReversedBinaryString() = toString(2).reversed()

}
