package chapter25;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Example4 {
    public static void main(String[] args) {
        CompletableFuture<Long> future = 
            CompletableFuture
                .supplyAsync(() -> fibonacci(40))
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 10 ))
                .orTimeout(5, TimeUnit.MICROSECONDS)
                .whenComplete((ret, err) -> {
                    if (err == null) {
                        System.out.println(ret);
                    } else {
                        System.out.println("エラーです。" + err.getMessage());
                    }
                });
    }
    
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
