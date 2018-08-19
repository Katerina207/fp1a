package homework.regex;

import lombok.NoArgsConstructor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@NoArgsConstructor
public final class Writer {

    public static void writeToFile(File file, StringBuffer value) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.append(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}