import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // String rev="";
        // for (int i = 0; i < s.length(); i++) {
        //     rev=s.charAt(i)+rev;
        // }
        // System.out.println(rev);

        for (int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i)+" ");
        }
    }
}
