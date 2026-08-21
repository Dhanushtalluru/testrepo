import java.util.Scanner;

class  BasicCalculator{
  public static void main (String args[]) { 

    Scanner sc = new Scanner(System.in);
    boolean status = true;
    System.out.println("========== BASIC CALCULATOR========");

    do {

        System.out.println("choose the operator\n 1 ---> Addition(+) \n 2 ---> Subtraction(-) \n 3 ---> Multiplication(*) \n 4 ---> Division(/\n 5 ---> to end");
        int operation = sc.nextInt();

        if (operation == 5){
            System.out.println("Calculator operations end now."); 
            break;

        } 

        if (operation < 1 || operation > 5){
            System.out.println("Error: Invalid choice try again");
            continue;
        }

        System.out.print("Enter the first operand: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second operand: ");
        double b = sc.nextDouble();

        switch (operation) {
            case 1:
                System.out.print(a+" + "+b+" = ");
                System.out.printf("%.2f\n", MathOperations.addition(a, b));
                break;
            case 2:
                System.out.print(a+" - "+b+" = ");
                System.out.printf("%.2f\n", MathOperations.subtraction(a, b));
                break;
            case 3:
                System.out.print(a+" * "+b+" = ");
                System.out.printf("%.2f\n", MathOperations.multiplication(a, b));
                break;
            case 4:
                System.out.print(a+" / "+b+" = ");
                System.out.printf("%.2f\n", MathOperations.division(a, b));
                break;
            case 5:
                System.out.println("calculator operations ends now.");
                status = false;
                break;
            default: 
                System.out.println("Invalid choice");
            }
        
    } while (status);
  }
}

