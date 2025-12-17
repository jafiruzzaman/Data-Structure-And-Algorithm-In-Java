package lecture02;
/*Question link(GFG): https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1 */

import java.util.Scanner;

public class linearSearch {
  static int linearSearch(int[] arr,int x){
    for (int i =0;i< arr.length;i++){
      if (arr[i]==x) return i;
    }
    return -1;
  }
  static void main() {
    System.out.println("linear search Problem");
    System.out.print("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()];
    System.out.print("Enter Array Elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the Element what you want to search in this array: ");
    int x = sc.nextInt();
    int result = linearSearch(arr,x);
//  Print the array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("\nThe element "+x+" is present at "+result+" index");
    // close
    sc.close();
  }
}
