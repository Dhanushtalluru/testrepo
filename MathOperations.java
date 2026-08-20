public class MathOperations {
    
    // Addition
    public static int addition(int a,int b){
        return a + b;
    }
    public static float addition(float a,float b){
        return a + b;
    }
    public static float addition(int a, float b){
        return a + b;
    }
    public static float addition(float a, int b){
        return a + b;
    }

    // Subtraction
    public static int subtraction(int a,int b){
        return a - b;   
    }
    public static float subtraction(float a,int b){
        return a - b;   
    }
    public static float subtraction(int a,float b){
        return a - b;   
    }
    public static float subtraction(float a,float b){
        return a - b;   
    }

    // Multiplication
    public static int multiplication(int a,int b){
        return a * b;
    }
    public static float multiplication(int a,float b){
        return a * b;
    }
    public static float multiplication(float a,int b){
        return a * b;
    }
    public static float multiplication(float a,float b){
        return a * b;
    }

    // Division
    public static void division(int a,int b) {
        if (b==0) System.out.print("Error: division with 0 not possible");
        else {
            float result = (float)a/b;
            System.out.print(result);
        }
    }
    public static void division(int a, float b) {
        if (b==0) System.out.print("Error: division with 0 not possible");
        else {
            float result = a/b;
            System.out.print(result);
        }
    }
    public static void division(float a, int b) {
        if (b==0) System.out.print("Error: division with 0 not possible");
        else {
            float result = a/b;
            System.out.print(result);
        }
    }
    public static void division(float a, float b) {
        if (b==0) System.out.print("Error: division with 0 not possible");
        else {
            float result = a/b;
            System.out.print(result);
        }
    }
}


