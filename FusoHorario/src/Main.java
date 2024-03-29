import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.of(2024, Month.FEBRUARY, 28);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(localDate.format(formatter));
    }
}
