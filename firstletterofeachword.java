import java.util.*;
public class firstletterofeachword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        s=s+str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                s=s+str.charAt(i+1);
            }
        }
        System.out.println(s);
    }
}
