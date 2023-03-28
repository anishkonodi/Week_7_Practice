import java.util.Scanner;

class Arrays {
  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int n;

  void insertion() {
    System.out.println("enter how meny elements you want to insert");
    n = s.nextInt();
    System.out.println("enter the elements to insert into the array");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("enter index position to insert a value");
    int index = s.nextInt();
    System.out.println("enter value to insert ");
    int value = s.nextInt();
    for (int i = n; i>index; i--) {
      arr[i]=arr[i-1];
    }
    arr[index] = value;
    n++;
    System.out.println("After inserting element to array");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }

  void deletion() {
    System.out.println("enter index position to delete a value");
    int index = s.nextInt();
    for (int i = index; i < n-1 ; i++) {
      arr[i] = arr[i + 1];
    }
    System.out.println("After deleting element in array");
    for (int i = 0; i < n-1; i++) {
      System.out.println(arr[i]);
    }
  }

  void search(){
    System.out.println("enter search element");
    int key=s.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
      if(arr[i]==key){
        System.out.println("Search element is present inside the array at the index "+i);
        count=1;
        break;
      }
    }
    if(count==0){
      System.out.println("Search element is not found");
    }
  }
}

class ArrayOperations {
  public static void main(String args[]) {
    
    Arrays obj = new Arrays();
    obj.insertion();
    obj.deletion();
    obj.search();
  }
}