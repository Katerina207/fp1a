package homework.stream.task1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Path path = Paths.get("src", "homework", "stream", "task1", "verse.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            String string = scanner.useDelimiter("//z").next();
            Counter counter = new Counter(string);
            WriteToFile.writeToFile(counter.countLetters());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}