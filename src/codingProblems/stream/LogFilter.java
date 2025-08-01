package codingProblems.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LogFilter {

    public static void main(String[] args) {
        List<String> logRecords = Arrays.asList(
                "2023-07-28 10:15:30 INFO Application started",
                "2023-07-28 10:30:45 DEBUG Loading modules",
                "2023-07-28 11:00:00 WARN Low memory",
                "2023-07-28 12:15:00 ERROR Unexpected shutdown",
                "2023-07-28 13:30:00 INFO Restart successful"
        );

        String start = "2023-07-28 10:30:00";
        String end = "2023-07-28 12:30:00";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDateTime = LocalDateTime.parse(start, formatter);
        LocalDateTime endDateTime = LocalDateTime.parse(end, formatter);

        List<String> filteredLogs = logRecords.stream()
                .filter(log -> {
                    String timestamp = log.substring(0, 19); // first 19 chars are the datetime
                    LocalDateTime logTime = LocalDateTime.parse(timestamp, formatter);
                    return (logTime.isEqual(startDateTime) || logTime.isAfter(startDateTime))
                            && (logTime.isEqual(endDateTime) || logTime.isBefore(endDateTime));
                })
                .collect(Collectors.toList());

        filteredLogs.forEach(System.out::println);
    }
}
