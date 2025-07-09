import java.util.Scanner;
class  firstProgramInJava{
  public static void addition(int a,int b){
    System.out.println(a+b);
  }
  public static void subtration(int a,int b){
    System.out.println(a-b);
  }
  public static void multiplication(int a,int b){
    System.out.println(a*b);
  }
  public static void division(float a,float b) {
    if (b==0) System.out.print("division with 0 not possible");
    else {
      float result =a/b;
      System.out.print(result);
    }
  }
  public static void main (String args[]) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("number1: ");
    int a = sc.nextInt();
    System.out.println("Number2: ");
    int b = sc.nextInt();
    boolean status = true;
    while (status) {
      System.out.println("Enter\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: to end");
      int operation = sc.nextInt();
      switch (operation) {
      case 1:addition(a, b);
      break;
      case 2:subtration(a, b);
      break;
      case 3:multiplication(a, b);
      break;
      case 4:division(a, b);
      break;
      case 5: status=false;
      break;
      default: System.out.println("Invalid choice");
    }

    }
  }
}
