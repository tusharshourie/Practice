import java.util.*;
public class reverseodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("cant reverse");
        }
        else{
            int sum=0;
            while (x>0) {
                int rem=x%10;
                sum=sum*10 + rem;
                x=x/10;
            }
            System.out.println(sum);
        }
    }
}
