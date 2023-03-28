import java.util.Scanner;
class ArrayDeletion{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={1,2,3,4,5,6,7};
    System.out.println("Before deletion ");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println("Enter index position to delete ");
    int index=s.nextInt();
    for(int i=index;i<arr.length-1;i++){
      arr[i]=arr[i+1];
    }

    System.out.println("After deletion ");
    for(int i=0;i<arr.length-1;i++){
      System.out.println(arr[i]);
    }
  }
}