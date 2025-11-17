import java.util.*;

public class Fibonacci {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int p1=0,p2=1;
        System.out.print(p1+" "+p2+" ");
        for(int i=2;i<n;i++){
            int sum=p1+p2;
            System.out.print(sum+" ");
            p1=p2;
            p2=sum;
        }
        sc.close();        
    }   
}
