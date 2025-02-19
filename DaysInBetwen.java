import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysInBetwen {

    /**
     * @param date1
     * @param date2
     * @return
     */
    public static long getDaysInBetweeen(LocalDate date1, LocalDate date2) {
       return Math.abs(ChronoUnit.DAYS.between(date1, date2)); 
    }
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);
        long daysInBetweeen = getDaysInBetweeen(date1, date2);
        System.out.println("Days in betweeen: " + daysInBetweeen);

        long daysBetweenReversed = getDaysInBetweeen(date2, date1);
        System.out.println("Days in betweeen reversed: " + daysBetweenReversed);
    }
}
