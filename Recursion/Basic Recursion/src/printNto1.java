import java.util.Scanner;

public class printNto1 {
	static void printNumbers(int n){
		// base case
		if (n==0) return;
		System.out.print(n+" ");
		printNumbers(n-1);
	}
	static void main() {
		System.out.println("Print N to 1 using Recursion");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumbers(n);
		sc.close();
	}
}
