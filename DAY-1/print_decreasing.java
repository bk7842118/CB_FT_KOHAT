public class print_decreasing {
        	public static void main(String[] args) {
		int n=5;
		pi(n);

	}
	public static void pi(int n) {
		//base case
		if(n==0) {
			return;
		}
		System.out.println(n);
		pi(n-1);
		
	}
}
