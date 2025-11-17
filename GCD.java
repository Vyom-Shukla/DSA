import java.util.*;

public class GCD {
    public static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String []args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int m=Sc.nextInt();
        int n=Sc.nextInt();
        int q=gcd(m,n);
        System.out.println("GCD :"+ q);
        Sc.close();
    }
}
