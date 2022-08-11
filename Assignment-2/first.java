/*
 * Name : Yash parmar
 * Roll no: 3138
 * Que 1: Create on default constructor for class College. In that take two attribute college name and address. in college name store "K.S School of business management" and in address value store "Ahemdabad" and display the output.
 */
class Collge{
    String name = "K.S school of business management";
    String address = "Ahmedabad";
    Collge(){
        System.out.println("College name is: "+name);
        System.out.println("College Address is: "+address);
    }
    public static void main(String[] args) {
        new Collge();
    }
}