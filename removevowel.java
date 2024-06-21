import java.util.*;
public class removevowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String ch="";
        char[] vow={'a','e','i','o','u'};
        for (int i = 0; i < s.length(); i++) {
            int c=0;
            for (int j = 0; j < vow.length; j++) {
                if(s.charAt(i)==vow[j]){
                    c++;
                }
            }
            if(c==0){
                ch=ch+s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
