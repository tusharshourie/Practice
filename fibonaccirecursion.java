public class fibonaccirecursion{
    public static void main(String[] args) {
        System.out.print("0 1 ");
        printfib(0, 1, 10);
    }

    public static void printfib(int a, int b, int num){
        if(num==0) return;

        System.out.print(a + b + " ");

        printfib(b, a+b, --num);
    }
}