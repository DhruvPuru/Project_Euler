
public class Four {

	public static void main(String[] args) {
		
		int max = 0;
		int bestI = 0;
		int bestJ = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j; 
				if (isPalindrome(prod)) {
					if (prod > max) {
						max = prod;
						bestI = i;
						bestJ = j;
					}
				}
			}
		}
		System.out.println(max);
		System.out.println(bestI);
		System.out.println(bestJ);
	}
	
	public static boolean isPalindrome(int n) {
		String s = Integer.toString(n);
		
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
}
