package homework.regex;

import lombok.NoArgsConstructor;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
public final class ReportTimeInterval {

    public static void generateReport(List<String> scheduleList) {
        File report = Paths.get("src", "homework", "regex", "interval_report.txt").toFile();
        Pattern pattern = Pattern.compile("^(\\d{2}:\\d{2})(.*)");
        Matcher currentMatcher;
        Matcher nextMatcher;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < scheduleList.size() - 1; i++) {
            currentMatcher = pattern.matcher(scheduleList.get(i));
            nextMatcher = pattern.matcher(scheduleList.get(i + 1));
            if (currentMatcher.find() && nextMatcher.find()) {
                currentMatcher.appendReplacement(result, currentMatcher.group(1) + "-" + nextMatcher.group(1) + currentMatcher.group(2) + "\n");
            } else {
                result.append("\n");
            }
        }
        Writer.writeToFile(report, result);
    }
}