package chapter25;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Example3 {
    public static void main(String[] args) throws Exception {
        
        CompletableFuture
            .supplyAsync(() -> "value")
            .orTimeout(1, TimeUnit.SECONDS)
            .whenComplete((ret, err) -> {
                if (err == null) {
                    System.out.println("★" + ret);
                } else {
                    System.out.println(err.getMessage());
                }
            });

                /*
                .completeExceptionally(TimeoutException e) {
                    e.printStackTrace(null);
                }
                */
    }
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
