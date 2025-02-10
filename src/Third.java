import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        // B - Simple Calculator
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        char op = input.next().charAt(0);
        int num2 = input.nextInt();

        if(op == '+'){
            System.out.println(num1 + num2);
        }
        // other operations


    }

}
