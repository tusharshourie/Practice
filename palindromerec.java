import java.util.*;
public class palindromerec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println("is" + word + "palindrome? - " + isPalindrome(word));
    }


    public static boolean isPalindrome(String word){
        String reverse= getRev(word);
        if(word.equals(reverse)){
            return true;
        }
        return false;
    }

    public static String getRev(String word){
        if(word==null || word.isEmpty()) return word;

        return word.charAt(word.length()-1)+getRev(word.substring(0, word.length()-1));
    }
}
