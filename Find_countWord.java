import java.util.Scanner;

public class Find_countWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String s=sc.nextLine();
        String ch="";

        
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if(Character.isLetter(arr[i].charAt(j))){
                    ch=ch+arr[i].charAt(j);
                }
            }
            if(ch.equals(s)){
                count++;
            }
            ch="";
        }
        System.out.println("Number of that word present in sentence= "+count);
    }
}
