import java.util.*;
public class countword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=""){
                count++;
            }
        }
        System.out.println(count);
    }
}
