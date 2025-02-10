import java.util.Scanner;

public class Second {
    // C - Dubstep
    public static void main(String[] args) {
        // C - Dubstep
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String[] words = text.split("WUB");
        for(String word:words){
            if(word.length()>0)
                System.out.print(word + " ");
        }
    }
}
