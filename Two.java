
public class Two {

	public static void main (String[] args) {
		
		int N = 4000000;
		int sum = 0;
		
		// 1, 2, 3, 5, 8, 13, 21...
		int j = 1;
		for (int i = 2; i < N;) {
			
			if (i % 2 == 0) {
				sum += i;
			}
			
			int t = i;
			i = i + j;
			j = t;
		}
		
		System.out.println(sum);
	}
}
