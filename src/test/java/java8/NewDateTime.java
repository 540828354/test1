package java8;

import java.time.*;

/**
 * Created by Administrator on 2018/5/3.
 */
public class NewDateTime {
    public static void main(String args[]) {
        //clock怎么玩
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getDayOfWeek());

        final Clock clock = Clock.systemUTC();
        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now( clock );
        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now( ZoneId.of( "America/Los_Angeles" ) );

        System.out.println( zonedDatetime );
        System.out.println( zonedDatetimeFromClock );
        System.out.println( zonedDatetimeFromZone );


        // Get duration between two dates
        final LocalDateTime from = LocalDateTime.of( 2014, Month.APRIL, 16, 0, 0, 0 );
        final LocalDateTime to = LocalDateTime.of( 2015, Month.APRIL, 16, 23, 59, 59 );

        final Duration duration = Duration.between( from, to );
        System.out.println( "Duration in days: " + duration.toDays() );
        System.out.println( "Duration in hours: " + duration.toHours() );

    }
}
