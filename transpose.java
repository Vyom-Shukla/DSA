import java.util.*;

public class transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int m=sc.nextInt();
        int n =sc.nextInt();
        int arr[][]=new int[m][n];
        int transpose[][]=new int[n][m];

        System.out.println("Enter Array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        // Correctly transpose the matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close(); 
    }
}