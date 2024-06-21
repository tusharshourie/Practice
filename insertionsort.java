public class insertionsort {
    public static void main(String[] args) {
        int arr[]={6,1,7,4,2,9,8,5,3};
        insertsort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void insertsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}


// after comparing elements to the left shift elements to the right to make rooms
// to insert a value

//O(n)