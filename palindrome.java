import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean check=true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                check=false;
                break;
            }
        }
        if(check==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
