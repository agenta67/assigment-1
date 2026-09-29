import java.util.Scanner;

public class task5e {
    public static void main (String[] args){
        Scanner i = new Scanner (System.in);
        int v = i.nextInt();
        int t = i.nextInt();
        int deb = (v*t)%109;{
            if (deb<0){
                deb+=109;
            }
        }
        System.out.println(deb);
    }
}