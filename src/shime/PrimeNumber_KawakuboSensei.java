package shime;

public class PrimeNumber_KawakuboSensei {
	
	static final int NUMBER = 10_000_001;
	
	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		int ptr = 0;
		int[] prime = new int[NUMBER/2];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		for(int n = 5; n <= NUMBER; n += 2) {
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				if(n % prime[i] == 0) {
					//System.out.println("n:" + n + " prime[i]:" + prime[i]);
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = n;
				//System.out.println("prime[ptr]:" + prime[ptr] + "  n:" + n);
			}
		}
		for(int i = ptr - 5; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		long end = System.currentTimeMillis();
		System.out.println("処理時間:" + (end - start));
		
	}
}
