import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ch="";
        int i,j;
        for ( i = 0; i < s.length(); i++) {
            for ( j = 0; j < i; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
            }
            if(i==j){
                ch=ch+s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
