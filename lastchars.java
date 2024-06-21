import java.util.*;
public class lastchars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String n="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                if (Character.isAlphabetic(s.charAt(i-1))) {
                    n=n+s.charAt(i-1);
                }
            }
            else if(i==s.length()-1 && Character.isAlphabetic(s.charAt(i))){
                n=n+s.charAt(i);
            }
        }
        System.out.println(n);        
    }
}
