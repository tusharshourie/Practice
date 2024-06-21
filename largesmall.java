import java.util.*;
public class largesmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nos: ");
        int n=sc.nextInt();sc.nextLine();
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number "+ (i+1) + ": ");
            arr[i]=sc.nextInt();sc.nextLine();
        }

        Arrays.sort(arr);
        System.out.println("Smallest: "+arr[0]);
        System.out.println("Largest: " + arr[arr.length-1]);
    }
}
