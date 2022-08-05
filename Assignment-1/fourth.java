/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 4 : Write a java program to swap two numbers entered by a user.
 */
import java.util.Scanner;
class Fourth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int temp;

        System.out.println("*******************");
        System.out.println("Before Swapping");
        System.out.println("A is : "+a);
        System.out.println("B is : "+b);

        // swapping logic
        temp = a; 
        a = b;
        b = temp;

        System.out.println("*******************");
        System.out.println("After Swapping");
        System.out.println("A is : "+a);
        System.out.println("B is : "+b);
        
        sc.close();
    }
}