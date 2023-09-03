package chapter25;

import java.util.concurrent.CompletableFuture;

public class Example1 {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future
            = CompletableFuture.supplyAsync(() -> "value");

        System.out.println("abc");

        String msg = future.get();
        
        System.out.println(fibonacci(50));

        System.out.println(msg);
    }

    public static long fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

}
