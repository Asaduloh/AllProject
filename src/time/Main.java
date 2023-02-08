package time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(ZoneId.of("Asia/Tashkent"));

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,3,2,7,07,17);
        LocalDateTime localDateTime2 = LocalDateTime.of(2023,3,2,7,07,16);
//        System.out.println(ChronoUnit.MICROS.between(localDateTime1, localDateTime));
//        System.out.println(ChronoUnit.NANOS.between(localDateTime1, localDateTime));
//        System.out.println(ChronoUnit.HALF_DAYS.between(localDateTime1, localDateTime));
        System.out.println(ChronoUnit.DAYS.between(localDateTime1, localDateTime));
        System.out.println(ChronoUnit.HOURS.between(localDateTime1, localDateTime));
     System.out.println(ChronoUnit.NANOS.between(localDateTime2,localDateTime1));
      /*  LocalTime localTime1 = LocalTime.MAX;
        System.out.println(localTime1);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 =LocalDate.of(2007,8,10);
        System.out.println(ChronoUnit.DAYS.between(localDate2, localDate));*/
    }
}
