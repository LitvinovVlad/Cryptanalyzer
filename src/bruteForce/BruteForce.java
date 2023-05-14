package bruteForce;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import alhabet.*;
import constants.Constants;
import files.*;
public class BruteForce {
    static String inputFileName;
        static ArrayList<String> encryptedText = new ArrayList<>();
        static String encryptedArrayString;
        static int trialKey = 0;
       static char[] encryptedCharacters;

    public static void startProgram(){
        System.out.println(Constants.fileName);
        inputFileName = Constants.inputFileName;
        createFile();
    }
        public static void createFile() {
            ReadingFile.createFilePath();
            for (int j = 0; j < AllSymbols.array.size() / 2; j++) {
                trialKey += 1;
                for (int i = 0; i < ReadingFile.originalText.size(); i++) {
                    encryptedCharacters = ReadingFile.originalText.get(i).toCharArray();
                    decryption();
                }
                keySelection();
            }
        }

        public static void decryption() {
            for (int i = 0; i < encryptedCharacters.length; i++) {
                for (int j = AllSymbols.array.size() / 2; j < AllSymbols.array.size(); j++) {
                    if (Character.compare(encryptedCharacters[i], AllSymbols.array.get(j)) == 0) {
                        int index = AllSymbols.array.lastIndexOf(encryptedCharacters[i]);
                        encryptedCharacters[i] = AllSymbols.array.get(index - trialKey);
                        break;
                    }
                }
                encryptedArrayString += encryptedCharacters[i];
            }
            encryptedText.add(encryptedArrayString);
            encryptedArrayString = "";
        }

        public static void keySelection(){
                for (String s : encryptedText) {
                    Pattern pattern = Pattern.compile("[а-яё], [а-яё]");
                    Matcher matcher = pattern.matcher(s);
                    boolean str = matcher.find();
                    if (str) {
                        WritingFile.recordingFile(encryptedText, inputFileName);

                    }
                    else {
                        encryptedText.clear();
                        break;
                    }
                }
            }
    }