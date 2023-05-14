package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import constants.*;
public class ReadingFile {
    public static final ArrayList<String> originalText = new ArrayList<>();
    public static void createFilePath () {
        String originalTextLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(Constants.inputFileName))) {
            while (reader.ready()) {
                originalTextLine = reader.readLine();
                originalText.add(originalTextLine);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
