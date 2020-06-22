import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+?(7|8)\\s?\\d{3}\\s?\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            System.out.println("Вы ввели номер: " + phone);
        }
        else
        {
            System.out.println("Номер телефона должен быть в формате: +7 XXX XXX-XX-XX");
        }
    }
}
