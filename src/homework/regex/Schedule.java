package homework.regex;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Schedule {

    public static void main(String[] args) {
        Path path = Paths.get("src", "homework", "regex", "schedule.txt");

        try {
            List<String> scheduleList = Files.readAllLines(path, Charset.forName("windows-1251"));
            ReportTimeInterval.generateReport(scheduleList);
            ReportTotalTime.generateReport(scheduleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}