enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int) =
        naturalNumber.checkItsNatural().findAliquotNumber().classify(naturalNumber)

private fun Int.checkItsNatural(): Int = if (this < 0) throw RuntimeException("must be Natural Number") else this


private fun Int.findAliquotNumber(): Int =
        (1..(this - 1)).fold(0) { acc, curr ->
            if (this % curr == 0) acc + curr else acc
        }

private fun Int.classify(naturalNumber: Int) =
        when {
            this == naturalNumber -> Classification.PERFECT
            this > naturalNumber -> Classification.ABUNDANT
            else -> Classification.DEFICIENT
        }