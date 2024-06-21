import java.util.*;
public class perfectno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean check=isPerfect(num);
        if(check==true){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not perfect");
        }

    }

    public static boolean isPerfect(int num){
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
