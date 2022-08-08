/*
 * Name : Yash parmar
 * Roll no : 3138
 * Question 2: write a java program to perform arithmetic operation (+,-,*,/,%) entered by a user.
 */
import java.util.Scanner;
class Second{
    static Double add(Double a,Double b){
      return a+b;
    }
    static Double sub(Double a,Double b){
      return a-b;
    }
    static Double mul(Double a,Double b){
      return a*b;
    }
    static Double div(Double a,Double b){
      return a/b;
    }
    static Double mod(Double a,Double b){
      return a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        Double a, b, result;
        System.out.print("Enter operator: ");
        operator = sc.next().charAt(0);

        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
              result = add(a,b);
              System.out.println(a + " + " + b + " = " + result);
              break;
      
            // performs subtraction between numbers
            case '-':
              result = sub(a,b);
              System.out.println(a + " - " + b + " = " + result);
              break;
      
            // performs multiplication between numbers
            case '*':
              result = mul(a,b);
              System.out.println(a + " * " + b + " = " + result);
              break;
      
            // performs division between numbers
            case '/':
              result = div(a,b);
              System.out.println(a + " / " + b + " = " + result);
              break;
            case '%':
              result = mod(a,b);
              System.out.println(a + " % " + b + " = " + result);
              break;
      
            default:
              System.out.println("Invalid operator!");
              break;
          }


        sc.close();
    }
}