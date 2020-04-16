import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = {"pero", "ruchka", "bumaga"};

        for (String str : input) {
            str = sc.nextLine();
        }

        Generator g = new Generator(input);
        String pwd = g.generate();

        System.out.println("Сгенерированный пароль: " + pwd);

        Console c = System.console();
        String pwd2 = new String(c.readPassword("Введите пароль: "));

        if (pwd.equals(pwd2)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
