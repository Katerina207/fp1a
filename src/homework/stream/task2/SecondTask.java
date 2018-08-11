package homework.stream.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SecondTask {

    public static void main(String[] args) {
        Path path = Paths.get("src", "homework", "stream", "task2", "digit.txt");
        File digit = path.toFile();
        try {
            digit.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = RandomDigitList.getRandomDigitList();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            bufferedWriter.append(list.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}