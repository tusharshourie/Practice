/*Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation: There are two words in the sentence that start and end with the same letter - "Anna" and "Ginseng". */
import java.util.*;
public class samefirstlastletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0)==arr[i].charAt(arr[i].length()-1)){
                c++;
            }
        }
        if(c>0){
            System.out.print("No of words with same first and last letters are: " + c);
            
        }
        else{
            System.out.println("No such wors are present");
        }
    }
}
