import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        int k=1;
        System.out.print(i+" ");
        while(k<num){
            System.out.print(k+" ");
            int p=k;
            k=k+i;
            i=p;
        }
    }
}
