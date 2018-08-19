package homework.regex;

import lombok.NoArgsConstructor;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
public final class ReportTotalTime {

    private static int DAY = 4;

    public static void generateReport(List<String> scheduleList) {
        File report = Paths.get("src", "homework", "regex", "total_time_report.txt").toFile();

        List<StringBuffer> scheduleListMinutes = new ArrayList<>();
        for (int i = 0; i < DAY; i++) {
            scheduleListMinutes.add(new StringBuffer());
        }

        findMinutesInterval(scheduleList, scheduleListMinutes);
        generateTotalTimeReport(scheduleListMinutes, report);
    }

    private static void generateTotalTimeReport(List<StringBuffer> values, File report) {
        for (int i = 0; i < DAY; i++) {
            StringBuffer result = new StringBuffer();
            StringBuffer lecture = new StringBuffer();
            int sumExercise = 0;
            int sumAnswer = 0;
            int sumRest = 0;
            int sumLecture = 0;

            Pattern pattern = Pattern.compile("[а-яА-Я|]* ([а-яА-Я]+) (\\d+) минут");
            Matcher matcher = pattern.matcher(values.get(i));
            while (matcher.find()) {
                if (matcher.group(1).equals("упражнения")) {
                    sumExercise += Integer.valueOf(matcher.group(2));
                } else if (matcher.group(1).equals("решения")) {
                    sumAnswer += Integer.valueOf(matcher.group(2));
                } else if (matcher.group(1).equals("перерыв")) {
                    sumRest += Integer.valueOf(matcher.group(2));
                } else {
                    sumLecture += Integer.valueOf(matcher.group(2));
                    lecture.append(matcher.group().trim() + "\n");
                }
            }

            int sum = sumAnswer + sumExercise + sumLecture + sumRest;
            result.append("Лекции: " + sumLecture + " минут " + (sumLecture * 100 / sum) + " % \n");
            result.append("Упражнения: " + sumExercise + " минут " + (sumExercise * 100 / sum) + " % \n");
            result.append("Решения: " + sumAnswer + " минут " + (sumAnswer * 100 / sum) + " % \n");
            result.append("Перерывы: " + sumRest + " минут " + (sumRest * 100 / sum) + " % \n");
            result.append("\nЛекции: \n");
            result.append(lecture);
            result.append("\n\n");

            Writer.writeToFile(report, result);
        }
    }

    private static void findMinutesInterval(List<String> scheduleList, List<StringBuffer> values) {
        int MINUTES_IN_HOUR = 60;
        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2})(.*)");
        Matcher currentMatcher;
        Matcher nextMatcher;
        int daysCounter = 0;

        for (int i = 0; i < scheduleList.size() - 1; i++) {
            currentMatcher = pattern.matcher(scheduleList.get(i));
            nextMatcher = pattern.matcher(scheduleList.get(i + 1));
            if (currentMatcher.find() && nextMatcher.find()) {
                int nextHour = Integer.valueOf(nextMatcher.group(1));
                int currentHour = Integer.valueOf(currentMatcher.group(1));
                int nextMinute = Integer.valueOf(nextMatcher.group(2));
                int currentMinute = Integer.valueOf(currentMatcher.group(2));
                int minutesInterval = (nextHour * MINUTES_IN_HOUR + nextMinute) - (currentHour * MINUTES_IN_HOUR + currentMinute);
                currentMatcher.appendReplacement(values.get(daysCounter), currentMatcher.group(3).toLowerCase() + " " + minutesInterval + " минут \n");
            } else if (currentMatcher.find() || nextMatcher.find()) {
                values.get(daysCounter).append("\n");
            } else {
                values.get(daysCounter).append("\n");
                daysCounter++;
            }
        }
    }
}