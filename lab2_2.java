import java.util.Scanner;
import java.util.regex.*;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pattern strong= Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})");
        byte chk=0;

        do {
            System.out.print("Введите пароль: ");
            String password = sc.nextLine();
            Matcher strpswd = strong.matcher(password);
            if (strpswd.matches()){ System.out.println("Пароль надёжен"); chk=1;}
            else System.out.println("Пароль ненадёжен. Повторите ввод");
        }while (chk==0);

    }
}



