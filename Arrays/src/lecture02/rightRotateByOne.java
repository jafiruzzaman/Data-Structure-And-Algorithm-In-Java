package lecture02;

import java.util.Scanner;

/*Question link: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1 */
public class rightRotateByOne {
  static void rightRotateAnArrayByOne(int[] arr){
    // length of the array
    int len = arr.length;
    int temp = arr[len-1];
    for (int i =len-1; i >0; i--) {
      arr[i] = arr[i-1];
    }
    // put back the temp at first index
    arr[0] = temp;
  }
  static void main() {
    System.out.println("Right Rotate An Array By One ");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // Brute-force Result
    System.out.print("After Rotating The Array: ");
    rightRotateAnArrayByOne(arr);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    // close sc
    sc.close();
  }
}
