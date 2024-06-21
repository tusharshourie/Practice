import java.util.*;
public class charrepeat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        int count=0;
        char c=str.charAt(i);
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(i)==c){
                count++;
            }
            else{
                System.out.println(c+" "+count);
                c=str.charAt(j);
                count=0;
                j--;
            }

            if (c==str.charAt(str.length()-1) && j==str.length()-1) {
                System.out.println(c+" "+count);
            }
        }
        sc.close();
    }
}