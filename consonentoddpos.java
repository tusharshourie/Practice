import java.util.*;
public class consonentoddpos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]={'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i <s.length(); i++) {
            boolean test=true;
            for (int j = 0; j < ch.length; j++) {
                if((i+1)%2==0 || s.charAt(i)==ch[j] || s.charAt(i)==' '){
                    test=false;
                }
            }
            if(test==true){
                System.out.println(s.charAt(i));
            }
        }
    }
}
