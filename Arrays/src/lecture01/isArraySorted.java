package lecture01;

import java.util.Scanner;

/* Question Link(GFG) : https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1 */
public class isArraySorted {
  /*Check if Array is Sorted*/
  /*Optimal Solution
    * Traverse The array
    * start from 1 to N
    * check if arr[i]>arr[i-1]
    * Return result
  */
  static boolean isSorted(int arr[]){
    int length = arr.length;
    for (int i = 1; i <=length-1; i++) {
      if (arr[i]<arr[i-1]) {
        return false;
      }
    }
    return true;
  }
  static void main() {
    System.out.print("is Array Sorted");
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
    boolean result = isSorted(arr);
    System.out.println("\nIs Array is Sorted ? "+result);
//  close Scanner
    sc.close();
  }
}
