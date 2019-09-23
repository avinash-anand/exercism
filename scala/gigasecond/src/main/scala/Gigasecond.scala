import java.time.{LocalDate, LocalDateTime, LocalTime}

object Gigasecond {

  private val GigaSecond: Long = 1000000000L

  def add(startDate: LocalDate): LocalDateTime = LocalDateTime.of(startDate, LocalTime.MIDNIGHT).plusSeconds(GigaSecond)

  def add(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(GigaSecond)
}
