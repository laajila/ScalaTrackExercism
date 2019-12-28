import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {
  def add(startDate: LocalDate): LocalDateTime = startDate.atStartOfDay().plusSeconds(scala.math.pow(10,9).toInt)

  def add(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(scala.math.pow(10,9).toInt)
}
