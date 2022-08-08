/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 5 : Write a java program to check number is even or odd enterd by a user.
 */
import java.util.Scanner; 
class Fifth{
    public static void main(String[] args){
        // initialize scanner object for getting user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}