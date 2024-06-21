/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.*;
public class evencheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0){
                count++;
            }
        }
        if(count>=3){
System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
