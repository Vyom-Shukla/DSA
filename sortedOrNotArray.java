import java.util.Scanner;

public class sortedOrNotArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending=true;

        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1])
                isAscending=false;
        }

        if(isAscending){
            System.out.println("Ascending");
        }
        else{
            System.out.println("Not Sorted");
        }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] < min) {
        //         min = numbers[i];
        //     }
        //     if (numbers[i] > max) {
        //         max = numbers[i];
        //     }
        // }
        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);
        sc.close();
    }
}
