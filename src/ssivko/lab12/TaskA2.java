package ssivko.lab12;

import java.util.ArrayList;
import java.util.Arrays;
import static ssivko.Ulils.callString;


public class TaskA2 {
    public static void main(String[] args) {
        System.out.println("Введите массив слов!");
        String text [] = callString();
        ArrayList<String> texts = new ArrayList<>(Arrays.asList(text));
        ArrayList<String> callText = new ArrayList<>();
        texts.stream().filter(s -> s.length() >= 6).forEach(callText::add);
        StringBuilder redact = new StringBuilder();
        redact.append(callText);
        System.out.println(callText);


    }
}
