package constants;
import alhabet.AllSymbols;

import java.nio.file.Path;
import java.util.Scanner;

public class Constants {
    public static final String fileName= "Введите путь к файлу: ";
    public static final String numKey= "Введите ключ для расшифровки: ";
    public static final String yourNumKey= "Ваш ключ для расшифровки: ";
    public static final String yourTextEncrypted= "Ваш текст зашифрован";
    public static final String yourTextDecrypted= "Ваш текст расшифрован";
    public static final String getFilePath= "Что бы получить путь к файлу вам необходимо: \nкликнуть правой кнопкой мыши на ваш файл -> свойства -> безопасность -> скопировать строку после \"имя объекта\"";
    public static String setInputFileName(){
        Scanner scan = new Scanner((System.in));
        String inputFileName = scan.nextLine();
        if(inputFileName.equals("")){
            inputFileName = "input.txt";
            inputFileName = String.valueOf(Path.of(inputFileName).toAbsolutePath());
        }
        return inputFileName;
    }




    public static final int random = key();
    public static int key(){
        return (int) (Math.random() * AllSymbols.array.size() / 2 + 1);
    }
}
