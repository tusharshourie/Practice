import java.util.*;

public class minasciichar {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char ch=str.charAt(0);
    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)<ch){
            ch=str.charAt(i);
        }
    }
    System.out.println(ch);
}    
}
