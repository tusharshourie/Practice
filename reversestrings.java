import java.util.*;
public class reversestrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        
        String rev=reversed(str);
        System.out.println(rev);
        sc.close();
    }

    public static String reversed(String str){
        char[] arr=str.toCharArray();
        int start=0;
        int end=str.length()-1;

        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
        return new String(arr);
    }
}
