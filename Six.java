
public class Six {

	public static void main (String[] args) {
		
		int N = 100; 
		int prodSum = 0;
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			prodSum += i*i;
			sum += i;
		}
		
		int sumSq = sum * sum;
		int result = sumSq - prodSum;
		System.out.println(result);
	}
}
