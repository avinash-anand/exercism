import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

    private static final Long GIGA_SECOND = 1_000_000_000L;
    private final LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        dateTime = LocalDateTime.of(moment, LocalTime.MIDNIGHT).plusSeconds(GIGA_SECOND);
    }

    Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(GIGA_SECOND);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }

}
