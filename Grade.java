import java.util.Scanner;

class Grade {
    public static void studentGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            studentGrade(n);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        sc.close();
    }
}