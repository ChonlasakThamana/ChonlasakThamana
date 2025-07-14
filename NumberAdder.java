import java.util.Scanner;

public class NumberAdder {
    
    // Method to add two numbers
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to add two double numbers
    public static double addTwoNumbers(double a, double b) {
        return a + b;
    }
    
    // Method to add multiple numbers from an array
    public static int addArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    // Method to add variable number of arguments
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== โปรแกรมบวกเลข ===");
        System.out.println("1. บวกเลขสองจำนวน");
        System.out.println("2. บวกเลขหลายจำนวน");
        System.out.println("3. ตัวอย่างการใช้งาน");
        System.out.print("เลือกตัวเลือก (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("ป้อนเลขที่ 1: ");
                double num1 = scanner.nextDouble();
                System.out.print("ป้อนเลขที่ 2: ");
                double num2 = scanner.nextDouble();
                System.out.println("ผลลัพธ์: " + num1 + " + " + num2 + " = " + addTwoNumbers(num1, num2));
                break;
                
            case 2:
                System.out.print("จำนวนเลขที่ต้องการบวก: ");
                int count = scanner.nextInt();
                int[] numbers = new int[count];
                
                for (int i = 0; i < count; i++) {
                    System.out.print("ป้อนเลขที่ " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                }
                
                System.out.print("ผลลัพธ์: ");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i]);
                    if (i < numbers.length - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" = " + addArray(numbers));
                break;
                
            case 3:
                // ตัวอย่างการใช้งาน
                System.out.println("\n=== ตัวอย่างการใช้งาน ===");
                
                // บวกเลขจำนวนเต็ม
                int result1 = addTwoNumbers(10, 20);
                System.out.println("10 + 20 = " + result1);
                
                // บวกเลขทศนิยม
                double result2 = addTwoNumbers(3.5, 2.8);
                System.out.println("3.5 + 2.8 = " + result2);
                
                // บวกเลขหลายจำนวน
                int result3 = addNumbers(1, 2, 3, 4, 5);
                System.out.println("1 + 2 + 3 + 4 + 5 = " + result3);
                
                // บวกเลขจาก array
                int[] sampleArray = {10, 25, 30, 15};
                int result4 = addArray(sampleArray);
                System.out.println("10 + 25 + 30 + 15 = " + result4);
                break;
                
            default:
                System.out.println("ตัวเลือกไม่ถูกต้อง!");
        }
        
        scanner.close();
    }
}