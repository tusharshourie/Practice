public class factorial {
    public static void main(String[] args) {
        int n=6;
        long fact=Multiply(n);
        System.out.println("factorisation of n = " + fact);
    }

    public static long Multiply(int n){
        if(n>=1) return n*Multiply(n-1);
        else  return 1;
    }
}
