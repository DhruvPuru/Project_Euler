import java.util.ArrayList;

public class Three {

	public static void main(String[] args) {

		
		
//		double N = 13195.0;
		double N = 600851475143.0;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		byte[] b;
		
		for (int t = 11; t < 100000; t = t*10 - 9) {
			b = new byte[1001];
			
			for (int i = 2; i <= 10; i++) {
				for (int j = 2*i; j <= 1000; j+= i) {
					b[j] = 1;
				}
			}
			
			for (int i = 2; i < b.length; i++) {
				if (b[i] == 0) {
					if (N % i == 0.0) {
						factors.add(i);
					}
				}
			}
		}
		
		System.out.println(factors);
		int bestPrime = factors.get(factors.size()-1);
		
		for (Integer i : factors) {
			N = N / i;
		}
		 
		int sN = (int) Math.ceil((long) Math.sqrt(N));

		b = new byte[(int) N+1];
		
		for (int i = 2; i <= sN; i++) {
			for (int j = 2*i; j <= N; j+= i) {
				b[j] = 1;
			}
		}
		
		int prime = 1;
		for (int i = 2; i < b.length; i++) {
			if (b[i] == 0) {
				if (N % i == 0.0) 
					prime = i;
			}
		}
		
		prime = Math.max(bestPrime, prime);
		System.out.println(prime);
	}
}
