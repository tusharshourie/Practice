import java.util.*;

public class remove2consecutiveletter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String res=remove2consecutive(s);
        System.out.println(res);
    }    

    public static String remove2consecutive(String s){
        String str="";
        char ch='\0';
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=ch){
                ch=s.charAt(i);
                str=str+ch;
            }
        }
        return str;
    }
}
