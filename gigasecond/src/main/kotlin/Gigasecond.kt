import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class Gigasecond(ldt: LocalDateTime) {

    constructor(ld: LocalDate) : this(LocalDateTime.of(ld, LocalTime.MIDNIGHT))

    val date: LocalDateTime = ldt.plusSeconds(1000000000L)

}