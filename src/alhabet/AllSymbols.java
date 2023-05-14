package alhabet;

import java.util.ArrayList;
public class AllSymbols {
    public static final ArrayList<Character> array = new ArrayList<>();

    public static void addSymbols() {
        for (int i = 32; i < 65; i++) {
            array.add((char) i);
        }
        for (int i = 1040; i < 1104; i++) {
            array.add((char) i);
        }
        array.add(70, (char) 1105);
        array.add(38, (char) 1025);
    }

    public static void creatingRoundArray() {
        addSymbols();
        array.addAll(array);
    }
}
