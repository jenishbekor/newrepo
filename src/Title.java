import java.util.Scanner;
public class Title {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String newtext = "";
        newtext = newtext +  Character.toUpperCase( text.charAt(0) );
        for(int i=1; i<text.length(); i++){
            char cur = text.charAt(i);
            char pre = text.charAt(i-1);
            if( Character.isLetter(cur) && Character.isSpaceChar(pre)){
                newtext = newtext +  Character.toUpperCase( cur );
            }
            else{
                newtext = newtext + cur;
            }
        }
        System.out.println(newtext);
    }
}
