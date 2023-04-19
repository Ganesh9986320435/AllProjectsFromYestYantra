import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class First {
	public static void main(String[] args) {
//		LocalDate localDate=LocalDate.now();
//		System.out.println(localDate);
//		String string="2023-12-01";
//		LocalDate localDate=LocalDate.parse(string);
//		System.out.println(localDate);
//		LocalDateTime localDateTime=LocalDateTime.now();
//		System.out.println(localDateTime);
//		LocalTime localTime=LocalTime.now();
//		System.out.println(localTime);
//		Stream.of(1,2,3,4).forEach(n->System.out.println(n));
//		LocalDate localDate = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String formattedDate = localDate.format(formatter);
//		LocalDate startDate = LocalDate.of(2023, 4, 1);
//		LocalDate endDate = LocalDate.of(2023, 4, 13);
//		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
//		System.out.println(daysBetween);
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime newDateTime = dateTime.plusHours(2).minusMinutes(30);
		System.out.println(newDateTime);
	}
}
