package lecture02;
import java.util.Scanner;


public class leftRotateByOne {
  /*Optimal Solution:
    * I will store the first element
    * I Will iterate the array and start replacing indexing at 0th
    * At the End I will place the first element to the end
  */
  static void leftRotateAnArrayByOne(int[] arr){
    // length of the array
    int len = arr.length;
    // store first value
    int temp = arr[0];
    for (int i = 1;i<len;i++){
      arr[i-1] = arr[i];
    }
    arr[len-1] = temp;
  }


  static void main() {
    System.out.println("Left Rotate An Array By One");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    // Brute-force Result
    System.out.println("After Rotating The Array: ");
    leftRotateAnArrayByOne(arr);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    // close sc
    sc.close();
  }
}
