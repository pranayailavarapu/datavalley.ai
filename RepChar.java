import java.util.*;
public class ReplaceChar{
    public static void main(String args[]){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Enter the index to be changed");
        int n = sc.nextInt();
        System.out.println("Enter the character to replace");
        String ch = sc.next();
        char chr = ch.charAt(0);
        sb.setCharAt(n,chr);
        System.out.println("The modified String is"+ sb);


    }
}