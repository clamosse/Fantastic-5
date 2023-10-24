import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        //default y-m-d date
        String dateStr = "2022-03-17 10:45:30";
        
        //y-m-d date formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);

        //m-d-y date formatter
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        System.out.println(formattedDate);
    }
}
