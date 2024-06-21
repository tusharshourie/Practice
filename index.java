import java.util.*;
public class index {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                System.out.println(i);
                c++;
                break;
            }
        }
        if (c==0) {
            System.out.println("Does not exist");
        }
    }
}
