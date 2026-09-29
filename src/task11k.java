import java.util.Scanner;

public class task11k {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        n = n%1440;
        int d = n/60;
        int m = n%60;
        System.out.println(d+" "+m);


    }
}