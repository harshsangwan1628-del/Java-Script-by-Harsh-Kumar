// Q51: Split a string into words/fields - parsing a comma-separated sensor log line
public class Q51_SplitStringWords {
    public static void main(String[] args) {
        String sensorLogLine = "2026-08-04T10:15:00,TEMP,23.4,PRESSURE,101.3,HUMIDITY,45.2";
        String[] fields = sensorLogLine.split(",");

        System.out.println("Parsed sensor log fields:");
        for (String field : fields) {
            System.out.println(field);
        }
    }
}
