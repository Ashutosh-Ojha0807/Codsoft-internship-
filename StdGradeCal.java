// import java.util.*;

// public class StdGradeCal {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of subjects: ");
//         int sub = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= sub; i++) {
//             System.out.println("Enter the marks in subject out of 100: " + i);
//             int marks = sc.nextInt();
//             sum += marks;
//         }
//         System.out.println("The total marks obtained by the student is: " + sum);
//         float average = sum/sub;
//         System.out.println("The average of marks is: " + average);
//         if (average >= 90) {
//             System.out.println("Student has got A grade");
//         } else if (average >= 80 && average < 90) {
//             System.out.println("Student has got B grade");
//         } else if (average >= 70 && average < 80) {
//             System.out.println("Student has got C grade");
//         } else if (average >= 60 && average < 70) {
//             System.out.println("Student has got D grade");
//         } else if (average >= 50 && average < 60) {
//             System.out.println("Student has got E grade");
//         } else {
//             System.out.println("Student has got F grade");
//         }
//     }
// }

import java.util.*;

public class StdGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in Maths: ");
        int m = sc.nextInt();
        System.out.println("Enter thhe marks in English: ");
        int e = sc.nextInt();
        System.out.println("Enter the marks in Hindi: ");
        int h = sc.nextInt();
        int sum = (m + e + h);
        System.out.println("Total marks are: " + sum);
        float average = sum / 3;
        System.out.println("The average of marks is: " + average);
        if (average >= 90) {
            System.out.println("Student has got A grade");
        } else if (average >= 80 && average < 90) {
            System.out.println("Student has got B grade");
        } else if (average >= 70 && average < 80) {
            System.out.println("Student has got C grade");
        } else if (average >= 60 && average < 70) {
            System.out.println("Student has got D grade");
        } else if (average >= 50 && average < 60) {
            System.out.println("Student has got E grade");
        } else {
            System.out.println("Student has got F grade");
        }
        sc.close();
    }
}