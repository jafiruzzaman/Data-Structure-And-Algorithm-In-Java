package lecture01;
/*Question Link(LeetCode): https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class removeDuplicates{
  /*Brute-force Solution:
    * Create a Set
    * traverse the array and insert into set
    * now traverse the set return
  */
  static int removeDuplicateBrute(int[] arr){
    // create a set put all the unique elements
    Set<Integer> set = new LinkedHashSet<>();

    // traverse the array
    for (int i: arr){
      set.add(i);
    }
    int index =0;
    for (int x : set){
      arr[index++] = x;
    }
    return index;
  }
  /*Optimal Solution
    * I will keep 2 pointer slow and fast
    * I will swap if the value of slow & fast pointer
    * return slow-pointer+1
  */
  static int removeDuplicatesOptimal(int[] arr){
    // slow pointer
    int slowPointer =0;
    for (int fastPointer=1;fastPointer< arr.length;fastPointer++){
      if (arr[fastPointer]!=arr[slowPointer]){
        slowPointer++;
        arr[slowPointer] = arr[fastPointer];
      }
    }
    return slowPointer+1;

  }
  static void main() {
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
    // brute Result
    int bruteResult = removeDuplicateBrute(arr);
    System.out.println("\nAfter Removing Duplicates Element In the Array present unique elements are: "+bruteResult);
    int optimalResult = removeDuplicatesOptimal(arr);
    System.out.println("After Removing Duplicates Element In the Array present unique elements are: "+optimalResult);
    // close sc
    sc.close();
  }
}