import java.util.*;

public class cons2vowel {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine().toLowerCase();
        String []s=str.split(" ");
        int count=0;
        for (int i = 0; i < s.length; i++){ 
        for (int j = 1; j < s[i].length(); j++) 
            {
            if(isVowel(s[i].charAt(j-1))==true && isVowel(s[i].charAt(j))==true){
                count++;
                break;
            }
        }
    }
        System.out.println(count);
        sc.close();
    }


    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
