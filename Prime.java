import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        if(n==1)
            System.out.println("Neither Prime nor Composite");
        int c=0;

        for ( int i =2; i<=n/2; i++) {
            if(n%i==0)
                c++;
        }
        if (c==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();

        
    }
}
