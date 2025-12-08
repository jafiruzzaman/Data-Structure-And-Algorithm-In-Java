package basics;

public class Main {
	public static void main(String[] args) {
		System.out.println("Basics Of Recursion");

        /*
            Recursion:
            Recursion is a technique where a function calls itself
            until a specific stopping condition (Base Case) is met.

            Why Recursion?
            ✔ Breaks a big/complex problem into smaller subproblems.
            ✔ Useful for tree problems, divide & conquer, backtracking, etc.

            Important Concepts:
            1️⃣ Base Case:
                → A condition that stops further recursive calls.
                → MUST return something to prevent infinite recursion.

            2️⃣ Recursive Relation:
                → The formula/logic through which the function calls itself
                  with a smaller input.

            Basic Structure:
                void fun(int n) {
                    if (n == 0) return;  // Base Case
                    fun(n - 1);          // Recursive Call (smaller input)
                }
        */
	}
}
