package balexej.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*3. Имеется строка с текстом. Вывести текст, составленный из последних букв
        всех слов*/
public class Task0 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        StringBuffer a = new StringBuffer();

        Pattern pat = Pattern.compile(".\\b");
        Matcher match = pat.matcher(text);
       while (match.find()) {
           a.append(match.group());
            System.out.println(a);
        }

        }

    }



