package lecture01;

public class Main {
  static void main() {
    System.out.println("learn the basics of Array");
    /* How to Create an Array */
    /*initialize an array*/
    int array[];
    /*Declare an array*/
    int arr[] = new int[5];
    /*insertion in an array */
    arr[0] = 12;
    arr[4] = -6;
    /* traverse an array */
    for (int i=0;i< arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
