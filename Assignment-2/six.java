/*
 * Name : Yash parmar
 * Roll no: 3138
 * Que 6: Write a program for constructor overloading for Shapearea class and find area of square,area of rectangle.Display the result using method. (value enter by user).
 */
import java.util.Scanner;
class Shapearea {
    Double bredth,height;
    Shapearea(Double b){
        bredth = b;
    }
    Shapearea(Double b,Double h){
        bredth = b;
        height = h;
    }
    void areaofsquare(){
        System.out.println("area of square is: "+(bredth*bredth));
    }   
    void areaofrectangle(){
        System.out.println("area of rectangle is : "+(bredth *height)); 
    }
    public static void main(String[] args) {
        Double bredth,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("1. area of square");
        System.out.println("2. area of rectangle");
        System.out.println("*************************");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter bredth:");
                bredth = sc.nextDouble();
                Shapearea square = new Shapearea(bredth);
                square.areaofsquare();
                break;
            case 2:
                System.out.print("Enter bredth:");
                bredth = sc.nextDouble();
                System.out.print("Enter height:");
                height = sc.nextDouble();
                Shapearea rectangle = new Shapearea(bredth,height);
                rectangle.areaofrectangle();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
