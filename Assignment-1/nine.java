/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 9 : Write a java program to calculate the sum of natural numbers.
 */
import java.util.Scanner; 
class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int i;
        int sum = 0;
        for(i=0;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("The sum of "+num+" natural numbers is: "+sum);     
    }
}
