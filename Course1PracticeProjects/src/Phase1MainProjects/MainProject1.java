package Phase1MainProjects;

import java.util.Scanner;
 
/**

 */
public class MainProject1 {
    public static void main(String[] args) {
        int a, b;
        char op;
 
        Scanner scanner;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Integers");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter an Operator from +, -, *, /");
        op = s.next().charAt(0);
 
        switch (op) {
        case '+':
            System.out.format("%d + %d = %d\n", a, b, a + b);
            break;
        case '-':
            System.out.format("%d - %d = %d\n", a, b, a - b);
            break;
        case '*':
            System.out.format("%d * %d = %d\n", a, b, a * b);
            break;
        case '/':
            System.out.format("%d / %d = %d\n", a, b, a / b);
            break;
        default:
            System.out.println("ERROR: Unsupported Operation");
        }
    }
}