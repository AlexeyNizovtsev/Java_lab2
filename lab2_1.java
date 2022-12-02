import java.util.Scanner;
import java.util.regex.*;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите дату: ");
        String date= sc.nextLine();
        Pattern correct = Pattern.compile("([0-2][0-9]|3[01])/(0[0-9]|1[012])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])");
        Pattern incorrect = Pattern.compile("((00|3[2-9]|[4-9][0-9])/(0[0-9]|1[012])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))|" +
                                                    "(([0-2][0-9]|3[01])/([2-9][0-9]|1[3-9])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))|" +
                                                        "(([0-2][0-9]|3[01])/(0[0-9]|1[012])/([01][0-8][0-9][0-9]))|" +
                                                            "((00|3[2-9]|[4-9][0-9])/([2-9][0-9]|1[3-9])/([01][0-8][0-9][0-9]))|" +
                                                                "((29|30|31)/02/(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))" +
                                                                    "(31/(04|06|09|11)/(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))");
        Matcher corr = correct.matcher(date);
        Matcher incorr= incorrect.matcher(date);
        if (incorr.matches()) System.out.println("Введенное выражение не является датой");
        else if (corr.matches()) System.out.println("Введенное выражение является датой");
            else System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");

    }
}
