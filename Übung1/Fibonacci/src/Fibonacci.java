public class Fibonacci {

    public static void main(String[] args) throws Exception {
        System.out.println(fib(7));
    }


    public static int fib(int n){
        if(n<=1){return n;}
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
}
