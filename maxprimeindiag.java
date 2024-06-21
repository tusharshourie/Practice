import java.util.*;
public class maxprimeindiag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter no of rows and colums: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int []diag=new int [n];
        int []diag2=new int[n];

        for(i =0; i<n; i++){
            for(j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
                if(i==j){
                    diag[i]=arr[i][j];
                }
            }
        }

        for(i=0;i<n;i++){
            for(j=n-1; j>=0; j--){
                if(i==(n-1-j)){
                    diag2[i]=arr[i][j];
                }
            }
        }



        System.out.println(Arrays.toString(diag2));
        int res[]=new int[diag.length+diag2.length];
        System.arraycopy(diag, 0, res, 0, diag.length);
        System.arraycopy(diag2, 0, res, 0, diag2.length);
        System.out.print(Arrays.toString(res));

        int prime[]= new int[0];
        for (int k = 0; k < res.length; k++) {
            int check=0;
            for(j=2; j<res[i]; j++){
                if(result[i]%j==0)
                {
                    check++;
                }
            }
            if(check==0)
            {
                prime = Arrays.copyOf(prime,prime.length+1);
                prime[prime.length-1]=result[i];
            }
        }
        System.out.println(Arrays.toString(prime));
        int max = 0;
        for (i=0; i<prime.length; i++)
        {
            if(prime[i]>max)
            {
                max = prime[i];
            }
        }
        System.out.println("The maximum prime : "+max);
    }
}
