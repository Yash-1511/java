/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 10 : Write a java program to check wheather a number is prime or not enter by a user.
 */
import java.util.Scanner;
class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        int i,m = 0,flag = 0;
        m = num/2;
        if(num == 0 || num == 1){
            System.out.println(num + " is not a prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num+" is a prime number");
            }
        }
    }
}
