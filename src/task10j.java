import java.util.Scanner;

public class task10j {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();

        System.out.println(n + 2 - n % 2);
    }
}