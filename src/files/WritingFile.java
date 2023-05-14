package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import constants.*;
public class WritingFile {
    public static void recordingFile (ArrayList<String> writingText, String inputFileName) {
        //перезаписываем файл
        try (FileWriter outFile = new FileWriter(inputFileName);
             PrintWriter out = new PrintWriter(outFile)) {
            for (String s : writingText) {
                out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
