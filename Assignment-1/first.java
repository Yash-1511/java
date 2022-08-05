import java.util.Scanner;

/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 1 : Write a java program to print any string value enter by a user. 
 */
class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Your string is: "+str);
        sc.close();
    }
}