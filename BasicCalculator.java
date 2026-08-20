import java.util.Scanner;

class  BasicCalculator{
  public static void main (String args[]) { 

    Scanner sc = new Scanner(System.in);
    boolean status = true;
    System.out.println("==========WELCOME TO THE BASIC CALCULATOR========");

    do {
        Number a = 0 ;
        Number b = 0;
        boolean validInput = true;
        System.out.println("Choose Input Type:\n1 ---> (int, int)\n2 ---> (int, float)\n3 ---> (float, int)\n4 ---> (float, float)\n");
        int inputType = sc.nextInt();

        if (inputType == 1){
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
        }else if (inputType == 2){
            System.out.println("Enter the first number:");
            a = sc.nextInt();
            System.out.println("Enter the second number:");
            b = sc.nextFloat();
        }else if (inputType == 3){
            System.out.println("Enter the first number:");
            a = sc.nextFloat();
            System.out.println("Enter the second number:");
            b = sc.nextInt();
        }else if (inputType == 4) {
            System.out.println("Enter the first number:");
            a = sc.nextFloat();
            System.out.println("Enter the second number:");
            b = sc.nextFloat();

        }else {
            System.out.println("Error: Invalid input choosen. ");
            validInput = false;
        }
    
        if(validInput){
            System.out.println("Enter\n 1 ---> Addition\n 2 ---> Subtraction\n 3 ---> Multiplication\n 4 ---> Division\n 5 ---> to end");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    if(inputType == 1){
                        System.out.println(MathOperations.addition((int)a, (int)b));
                    }else if (inputType == 2){
                        System.out.println(MathOperations.addition((int)a, (float)b));
                    }else if (inputType == 3){
                        System.out.println(MathOperations.addition((float)a, (int)b));
                    }else{
                        System.out.println(MathOperations.addition((float)a, (float)b));
                    }
                    break;
                case 2:
                    if(inputType == 1){
                        System.out.println(MathOperations.subtraction((int)a, (int)b));
                    }else if (inputType == 2){
                        System.out.println(MathOperations.subtraction((int)a, (float)b));
                    }else if (inputType == 3){
                        System.out.println(MathOperations.subtraction((float)a, (int)b));
                    }else{
                        System.out.println(MathOperations.subtraction((float)a, (float)b));
                    }
                    break;
                case 3:
                    if(inputType == 1){
                        System.out.println(MathOperations.multiplication((int)a, (int)b));
                    }else if (inputType == 2){
                        System.out.println(MathOperations.multiplication((int)a, (float)b));
                    }else if (inputType == 3){
                        System.out.println(MathOperations.multiplication((float)a, (int)b));
                    }else{
                        System.out.println(MathOperations.multiplication((float)a, (float)b));
                    }
                    break;
                case 4:
                    MathOperations.division(a.intValue(), b.intValue());
                    break;
                case 5:
                    status=false;
                    break;
                default: 
                    System.out.println("Invalid choice");
            }

        }
        
    } while (status);
  }
}
