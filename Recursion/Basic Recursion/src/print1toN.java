import java.util.Scanner;

public class print1toN {
	static void printNumber(int n){
		// Base-Case
		if(n==0) return;
		// Recursive Relation
		printNumber(n-1);
		System.out.print(n+" ");
	}
	static void main() {
		System.out.println("Print 1 to N Using Recursion");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumber(n);
		sc.close();
	}
}
