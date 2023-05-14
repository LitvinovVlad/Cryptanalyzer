package decoder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import alhabet.AllSymbols;
import constants.Constants;
import files.WritingFile;

public class Decryption {
    static String inputFileName;
    public static int key;
        static ArrayList<String> text = new ArrayList<>();
        static StringBuilder line2 = new StringBuilder();
        static String line = "";
        static char[] array;

    public static void startProgram() {

        System.out.println(Constants.numKey);
        key = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(Constants.fileName);
        inputFileName = Constants.inputFileName;
        createFilePath();
    }

        public static void createFilePath() {

            try (BufferedReader reader = new BufferedReader(new FileReader(Constants.inputFileName))) {
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

        public static void cipher() {   for (int i = 0; i < array.length; i++) {
            for (int j = AllSymbols.array.size() / 2; j < AllSymbols.array.size(); j++) {
                if (Character.compare(array[i], AllSymbols.array.get(j)) == 0) {
                    int index = AllSymbols.array.lastIndexOf(array[i]);
                    array[i] = AllSymbols.array.get(index-key);

                    break;
                }
            } line2.append(array[i]);
        }
            text.add(line2.toString());
        }
        public static void endProgram(){
        WritingFile.recordingFile(text, inputFileName);
            System.out.println(Constants.yourTextDecrypted);
        }
    }
