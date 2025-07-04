import java.util.Scanner;
class Main {
  public static void main (String args[]) {  
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name+", welcome to the java programming language");
    System.out.println("sum of a and b");  
    System.out.println("enter number a: ");
    int a = sc.nextInt();
    System.out.println("enter number b: ");
    int b = sc.nextInt();
    System.out.println(a+b);
    sc.close();
    System.out.println("end of program");
  }
}
