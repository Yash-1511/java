import java.util.Scanner;

/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 7 : Write a java program to find the largest among three number.
 */
class Seven {
    static int largest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        sc.close();
        int output = largest(a, b, c);
        System.out.println("largest number is: "+output);  
    }
}
