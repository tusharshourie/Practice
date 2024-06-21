import java.util.*;
public class countvowelchardig {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        int v=0, c=0, d=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(Character.isDigit(s.charAt(i))){
                d++;
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);

    }
}
