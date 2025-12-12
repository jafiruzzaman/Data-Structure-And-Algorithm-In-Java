package lecture02;

import java.util.Scanner;

/*Question link(LeetCode): https://leetcode.com/problems/move-zeroes/description/ */
/*Question link(GfG): https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1 */
public class moveZeros {
  /*Brute Force Solution:
    * I will create a temp array and insert all the non-zero number
    * I will count all the zeros and put after the non-zero
    * I will put all of these into the original array
  */
  static void moveZerosBrute(int[] arr){
    // Create a temp array;
    int[] temp = new int[arr.length];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]!=0){
        temp[index++] = arr[i];
      }
    }
    // Step 2: Fill remaining with zeros
    while (index < arr.length) {
      temp[index++] = 0;
    }

    // Step 3: Copy temp back to original array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }
  }

  /*Optimal Solution:
    * Find the first Zero in the array
    * I will keep 2 pointer
    * iterate array
  */
  static void moveZerosOptimal(int[] arr){
    int j =0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]!=0){
//        swap
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
  }


  static void main() {
    System.out.println("Move Zeros to the end Problem");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Brute Force Solution: ");
    moveZerosBrute(arr);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("\nOptimal Solution: ");
    moveZerosOptimal(arr);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
