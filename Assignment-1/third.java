/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 3 : Write a java program to find Ascii value of a character enter by a user. 
 */
import java.util.Scanner; 
class Third{
    public static void main(String[] args){
        // initialize scanner object for getting user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        //for ascci value
        int ascci = ch;
        System.out.println("Your character is: "+ch);
        System.out.println("Ascci value of character is: "+ascci);
        sc.close();
    }
}