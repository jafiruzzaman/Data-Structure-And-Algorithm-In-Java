package lecture02;
import java.util.Scanner;

/* Question link (LeetCode): https://leetcode.com/problems/rotate-array/ */
public class rightRotateByDPlaces {
  static void reverse(int[] arr,int start,int end){
    while (start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  static void rightRotateAnArrayByDPlaces(int[] arr,int rotate){
    // length of array
    int len = arr.length;
    // edge-case for rotation
    rotate = rotate%len;
// reverse the whole array
    reverse(arr,0, len-1);
    // After Reversing The Whole array first rotate the first half part of the Array menas[0 to rotate-1]
    reverse(arr,0,rotate-1);
    // After Reversing The Whole array rotate the second half part of the Array means [rotate to n-1]
    reverse(arr,rotate, len-1);

  }
  static void main() {
    System.out.println("Right Rotate An Array By D Places");
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
    System.out.print("After Rotating The Array: ");

    rightRotateAnArrayByDPlaces(arr,rotate);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    // close
    sc.close();
  }
}
