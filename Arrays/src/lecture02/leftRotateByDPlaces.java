package lecture02;
/* Question link (GFG): https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1 */

import java.util.Scanner;

public class leftRotateByDPlaces {
  /* brute-force Solution
    * first create a temp array then store all the elements
    * start iterating the elements and start shifting it
    * then put-back it into the array
  */
  static void leftRotateAnArrayByDPlacesBrute(int[] arr,int rotate){
    // length of the array
    int len = arr.length;
    // create a temp array
    int[] temp = new int[rotate];
    for (int i =0;i<rotate;i++){
      temp[i] = arr[i];
    }
    // shift array elements
    for (int i = rotate;i<len;i++){
      arr[i-rotate] = arr[i];
    }
    // put-back array elements
    int index =0;
    for (int i = rotate;i<len;i++){
      arr[i] = temp[index++];
    }
  }
  /* Optimal Solution
    * I will reverse the first part means the after rotating elements
    * I will reverse the second part means the elements comes first
    * I will reverse the whole array
  */
  static void leftRotateAnArrayByDPlaces(int[] arr,int rotate){
    // length of the array
    int len = arr.length;
    rotate = rotate%len;
    // first rotate the first half part of the Array means [0 to rotate-1]
    reverse(arr,0,rotate-1);
    // rotate the second half part of the Array means [rotate,len-1]
    reverse(arr,rotate, arr.length-1);
    // reverse the whole array
    reverse(arr,0, arr.length-1);
  }
  // Reverse Array Method
  static void reverse(int[] arr,int start,int end){
    while (start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void main() {
    System.out.println("Left Rotate an Array By D Places");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("How many times to rotate: ");
    int rotate = sc.nextInt();
    // Brute-force Result
    System.out.print("\nAfter Rotating The Array: ");

    leftRotateAnArrayByDPlacesBrute(arr,rotate);
    leftRotateAnArrayByDPlaces(arr,rotate);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    // close sc
    sc.close();
  }
}
