import java.util.*;
public class intersectionofsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1[]=new int[4];
        int a2[]=new int[5];
        int Inter[]=new int[0];

        System.out.println("Set 1:");
        for (int i = 0; i < a1.length; i++) {
            System.out.print((i+1) + ": ");
            a1[i]=sc.nextInt();
        }
        
        System.out.println("Set 2:");
        for (int i = 0; i < a2.length; i++) {
            System.out.print((i+1) + ": ");
            a2[i]=sc.nextInt();
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i]==a2[j]) {
                    Inter=Arrays.copyOf(Inter, Inter.length+1);
                    Inter[Inter.length-1]=a1[i];
                }
            }
        }

        System.out.println("Intersection of arrays: ");
        for (int i = 0; i < Inter.length; i++) {
            System.out.print(Inter[i]+" ");
        }
    }
}
