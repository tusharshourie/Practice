import java.util.*;
public class mergestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String arr1[]=s1.split(" ");
        String s2=sc.nextLine();
        String arr2[]=s2.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            arr1=Arrays.copyOf(arr1, arr1.length+1);
            arr1[arr1.length-1]=arr2[i];
        }

        String n=Arrays.toString(arr1);
        String k = n.substring(1, n.length()-1);
        System.out.println(k);
    }
}
