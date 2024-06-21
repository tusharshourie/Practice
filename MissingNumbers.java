import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Sort the array first

        int num = arr[0]; // Start with the first element
        for (int i = 1; i < arr.length; i++) {
            while (i < arr.length && num + 1 != arr[i]) {
                System.out.print((num + 1) + " ");
                num++;
            }
            num = arr[i]; // Move to the next number in the array
        }
    }
}
