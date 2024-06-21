import java.util.*;
public class countupperlower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int countLow=0,countUp=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                countLow++;
            }
            else{
                countUp++;
            }
        }

        System.out.println("Lower case= " + countLow);
        System.out.println("Upper= " + countUp);
        sc.close();
    }
}

