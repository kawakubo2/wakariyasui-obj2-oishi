package shime;

public class Eratosthenes {
    static final int NUMBER = 10_000_001;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int cnt = 0;
        int[] primes = new int[NUMBER];  
        // 2の倍数だけは最初にすべてフラグをたてておく
        cnt++; // 2は素数とする
        for (int i = 4; i < NUMBER; i += 2) {
            primes[i] = 1;
        }
        // 回数を減らすため奇数だけにした
        for (int i = 3; i < NUMBER; i += 2) {
            // 以下のコードを入れるのを忘れいた!!!
            if (primes[i] == 1) continue;
            // この時点でiが素数であることが判明している
            cnt++;
            // i自体には1を立てたくないので、i+iから始めている
            for (int j = i + i; j < NUMBER; j += i) {
                primes[j] = 1;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("処理時間(エラトステネスの篩版): " + (end - start) + "ms");
        System.out.println("素数の個数: " + cnt);
        int counter = 0;
        for (int i = NUMBER - 1; i >= 0; i--) {
            if (primes[i] == 0) {
                System.out.println(i);
                counter++;
                if (counter == 5) break;
            }
        }
    }
}
