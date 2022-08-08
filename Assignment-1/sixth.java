/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 6 : Write a java program to check whether an alphabet is vowel or consonant using switch statement.
 */
import java.util.Scanner;
class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("character is vowel");
                break;
            default:
                System.out.println("character is constant");
        }
    }
}
