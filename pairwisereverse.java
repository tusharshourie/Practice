import java.util.*;
public class pairwisereverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev=pairwiserev(str);
        System.out.println(rev);
    }

    public static String pairwiserev(String str){
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < str.length(); i+=2) {
            res.append(str.charAt(i+1));
            res.append(str.charAt(i));
        }

        if(str.length()%2!=0){
            res.append(str.charAt(str.length()-1));
        }
        return res.toString();
    }
}
