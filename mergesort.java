public class mergesort {
    public static void main(String[] args) {
        int arr[]={6,1,7,4,2,9,8,5,3};
        mergesort(arr);
        for(int i:arr){
            System.out.println(i);
    }
}

    public static void mergesort(int arr[]){
        int length=arr.length;
        if(length<=1) return;

        int mid=length/2;
        int left[]=new int[mid];
        int right[]=new int[length-mid];


        int i=0; //la
        int j=0; //ra

        for (; i < length; i++) {
            if(i<mid){
                left[i]=arr[i];
            }
            else{
                right[j]=arr[i];
                j++;
            }
        }
        mergesort(left);
        mergesort(right);
        merge(left, right, arr);

    }

    public static void merge(int larr[], int rarr[], int arr[]){
        int lsize=arr.length/2;
        int rsize=arr.length-lsize;
        int i=0;
        int l=0;
        int r=0;
        while(l<lsize && r<rsize){
            if(larr[l]<rarr[r]){
                arr[i]=larr[l];
                i++;
                l++;
            }
            else{
                arr[i]=rarr[r];
                i++;
                r++;
            }
        }
        while(l<lsize){
            arr[i]=larr[l];
            i++;
            l++;
        }
        while (r<rsize) {
            arr[i]=rarr[r];
            i++;
            r++;
        }
    }
}

//O(nlog n)