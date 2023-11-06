package Lab3;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n, p=0, u=1, s=0;
        System.out.print("N = ");
        n=in.nextInt();
        while (s<=n){
            System.out.println(s);
            p=u;
            u=s;
            s=p+u;
        }
    }
}