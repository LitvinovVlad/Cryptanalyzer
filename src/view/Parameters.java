package view;

import bruteForce.BruteForce;
import decoder.Decryption;
import encoder.CaesarCipher;

import java.util.Scanner;

public class Parameters {
    public static final String[] getParameters = {
      "Введите 1, чтобы зашифровать текст",
            "Введите 2, чтобы расшифровать текст",
                 "Введите 3, чтобы запустить метод расшифровки BruteForce"
    };
    public static void viewParameters(){
        for (String getParameter : getParameters) {
            System.out.println(getParameter);
        }
    }
    public static void startProgram(){
        viewParameters();
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()){
            case 1: CaesarCipher.startProgram();
            break;
            case 2: Decryption.startProgram();
            break;
            case 3: BruteForce.startProgram();
            break;
            default:
                System.out.println("Пожалуйста, попробуйте ещё раз. Введите число от 1 до 3.");
                startProgram();
        }
    }
}
