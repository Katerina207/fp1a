package homework.stream.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public final class WriteToFile {

    public static void writeToFile(Map<Character, Integer> map) {
        Path path = Paths.get("src", "homework", "stream", "task1", "letter.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))) {
            writer.append(map.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}