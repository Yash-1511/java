/*
 * Name : Yash parmar
 * Roll no: 3138
 * Que 4: Create on parameterized constructor for Marks class. and calculate the average of three subject. Display the result using method (value enter by user).
 */
import java.util.Scanner;
class Marks{
    Double marks1,marks2,marks3;
    Marks(Double m1,Double m2,Double m3){
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    Double calculate(){
        return (marks1+marks2+marks3)/3;
    }
    void display(){
        Double res = calculate();
        System.out.println("Area of circle is: "+ String.format("%.2f", res));
    }
    public static void main(String[] args) {
        Double m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 marks: ");
        m1 = sc.nextDouble();
        System.out.print("Enter Subject 2 marks: ");
        m2 = sc.nextDouble();
        System.out.print("Enter Subject 3 marks: ");
        m3 = sc.nextDouble();
        sc.close();
        Marks obj = new Marks(m1,m2,m3);
        obj.display();
    }
}