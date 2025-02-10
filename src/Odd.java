import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {
        // Task B - Simple Calculator
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        char op = input.next().charAt(0);
        int num2 = input.nextInt();

        if( op =='+'){
            System.out.println(num1 + num2);
        }
        else if(op =='-'){
            System.out.println(num1-num2);
        }
        else if (op == '/'){
            System.out.println(num1/num2);
        }
        else if(op =='*'){
            System.out.println(num1 * num2);
        }


    }

}
