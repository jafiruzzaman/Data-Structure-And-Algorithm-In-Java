package lecture01;
import java.util.Scanner;

/*Question Link(GFG): https://www.geeksforgeeks.org/problems/second-largest3735/1 */
public class secondLargest {
  /* Brute-Force Solution
    * Step 01: First Sort the Array using (Merge,Quick) sort
    * Step 02: Traverse the array from back and compare with the largest
    *Total*
    * Time-Complexity: O(n log n)+ O(n)
    * Space-Complexity: O(1)
  */
  /* Better Solution
    * Step 01: First Find the Largest Element in Array
    * Step 02: Reverse Traverse the array and compare with the largest
    * Step 03: If Not Then update secondLargestElement = arr[i]
  */
  static int secondLargestBetter(int arr[]){
    if (arr.length<2) return -1;
    // first Find largest
    int largestElement = arr[0];
    for (int i:arr){
      if (i>largestElement) largestElement = i;
    }
    // Now Find the Second-Largest
    int secondLargest =Integer.MIN_VALUE;
    boolean found = false;
    for (int i:arr){
      if (i<largestElement && i>secondLargest){
        secondLargest = i;
        found = true;
      }
    }
    return found ?  secondLargest: -1;
  }
  /* Optimal Solution: Two Pointer Approach
   * Step 01: Store largest as arr[0] and secondLargest as -1
   * Step 02: if arr[i] > the largest update secondLargest = largest;
   * Step 03: largest will be arr[i]
   * Step 04 return secondLargest
   */
  static int secondLargestOptimal(int arr[]){
    // edge-case
    int len = arr.length;
    if (len<2) return -1;
    //
    int largest = arr[0];
    int secondLargest = -1;
    for (int i = 1; i < len; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] < largest && arr[i] > secondLargest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }
  static void main() {
    System.out.println("Second Largest Element in An Array");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    // Result
    int betterResult = secondLargestBetter(arr);
    System.out.println("\nThe second largest Element for Better Solution : "+betterResult);

    // Optimal Result
    int optimalResult = secondLargestOptimal(arr);
    System.out.println("\n The Second largest Element for Optimal Solution: "+optimalResult);
//  close Scanner
    sc.close();
  }
}
