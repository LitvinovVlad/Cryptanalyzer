package encoder;

import java.io.*;
import java.util.ArrayList;

import constants.*;
import alhabet.*;
import files.WritingFile;

public class CaesarCipher {
    static String inputFileName;
    static ArrayList<String> text = new ArrayList<>();
    static StringBuilder line2 = new StringBuilder();
    static String line;
    static char[] array;

    public static void startProgram() {
        System.out.println(Constants.fileName);
        inputFileName = Constants.inputFileName;
        createFilePath();
    }

    public static void createFilePath() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            while (reader.ready()) {
                line2 = new StringBuilder();
                line = reader.readLine();
                array = line.toCharArray();
                cipher();

            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        endProgram();
    }

    public static void cipher() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < AllSymbols.array.size() / 2; j++) {
                if (Character.compare(array[i], AllSymbols.array.get(j)) == 0) {
                    int index = AllSymbols.array.indexOf(array[i]);
                    array[i] = AllSymbols.array.get(index+Constants.random);

                    break;
                }
            } line2.append(array[i]);
        }
        text.add(line2.toString());
    }
    public static void endProgram(){
        WritingFile.recordingFile(text, inputFileName);
        System.out.println(Constants.yourTextEncrypted);
        System.out.println(Constants.yourNumKey + Constants.random);
    }
}
