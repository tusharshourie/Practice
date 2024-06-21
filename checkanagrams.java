import java.util.*;
public class checkanagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        if(str1.length()==str2.length()){
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isAnagram=Arrays.equals(arr1, arr2);
            System.out.println("Anagram: " + isAnagram);
        }
        else{
            System.out.println("Anagram:" + false);
        }
    }
}
