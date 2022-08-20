package codes;

public class Fibonacci {
	
	public static void fibo(int n) {
		int p1 = 0;
		int p2 = 1;
		
		if(n<=0) {
			System.out.println("");
		}
		else if(n==1) {
			System.out.println(0);
		}
		
		else {
			
			System.out.println(p1);
			System.out.println(p2);
			int x = p1+p2;
			
			while(x<n) {
				System.out.println(x);
				p1 = p2;
				p2 = x;
				x = p1+p2;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		fibo(500);
	}

}
