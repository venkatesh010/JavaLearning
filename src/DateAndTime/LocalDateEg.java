package DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateEg {
    public static void main(String[] args) {
        Period p = Period.ofDays(35);
        LocalDateTime localDateBefore= LocalDateTime.of(2017, 04, 21,21,21,12);
        LocalDateTime localDateAfter= LocalDateTime.of(2017, 04, 17,21,21,21);
        //Period period = Period.between(localDateBefore, localDateAfter);   // Used for LocalDate
        Duration duration = Duration.between(localDateAfter,localDateBefore);   // Used for LocalDateTime and LocalTime
        System.out.println(duration);
    }
}
