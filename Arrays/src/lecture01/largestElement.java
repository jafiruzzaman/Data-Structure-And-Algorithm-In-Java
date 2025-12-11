package lecture01;
/*Question Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1*/
import java.util.Scanner;

public class largestElement {
  /* brute-force solution
    * Step 01: Use Sorting --> (Merge Sort,Quick Sort)
    * Step 02: Return the last Index of the Array
  */
  /* Optimal Solution
    * Step 01: I will Assume that arr[0] is the largest-element
    * Step 02: I will traverse and check if arr[i] > largest-element
    * Step 03: If largest then replace with largest-element
  */
  static int findLargest(int arr[]){
    // Optimal Solution
      int length = arr.length;

      // edge-case
      if (length == 0) return -1;

      int largest = arr[0];

      for (int i = 0; i < length; i++) {
        if (arr[i] > largest) {
          largest = arr[i];
        }
      }
      return largest;
  }
  static void main() {
    System.out.println("Find the Largest Element in an Array");

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
    int largest = findLargest(arr);
    System.out.println("\nThe Largest Element in the Array is "+largest);
//  close Scanner
    sc.close();
  }
}
