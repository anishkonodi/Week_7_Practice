
//3. Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException  to throw when a product is not found in the store.
import java.util.Scanner;

class Product {
  String name;
  double price;

  void setName(String name) {
    this.name = name;
  }

  void setPrice(double price) {
    this.price = price;
  }

  String getName() {
    return name;
  }

  double getPrice() {
    return price;
  }
}

class ProductNotFoundException extends Exception {
  ProductNotFoundException(String str) {
    super(str);
  }
}

class Store extends Product{
  Scanner s = new Scanner(System.in);
  Product item[] = new Product[10];
  
  int numProduct = 0;
  int num;

  void addProduct() {
    Product obj = new Product();
    System.out.println("Enter how much product you want to add");
    num = s.nextInt();
    for (int i = 0; i < num; i++) {
      System.out.println("Enter the name of the product");
      obj.setName(s.next());
      System.out.println("Enter the price for the product");
      obj.setPrice(s.nextDouble());
      item[numProduct] = obj;
      numProduct++;
      System.out.println("Product " + (i + 1) + " added successfully");
    }
  }

  void removeProduct(String pro) throws ProductNotFoundException {
    for (int i = 0; i < num; i++) {
      if (item[i].getName().equals(pro)) {
        for (int j = i; j < num-1; j++) {
          item[j] = item[j + 1];
        }
        System.out.println("Product " + item[i].getName() + " removed successfully");
        break;
      } else {
        throw new ProductNotFoundException("Product not found");

      }
    }
  }

  void displayProducts() {
    System.out.println("Name  ----------  Price   ");
    for (int i = 0; i < 3; i++) {
      Product obj=(Product) item[i];
      System.out.println(obj.getName() + "  --------  " + obj.getPrice());
    }
  }
}

class OnlineShopDemo {
  public static void main(String args[]) {
    Store sto = new Store();
    Scanner s = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Enter the choice");
      System.out.println("1. Add Product");
      System.out.println("2. Remove Product");
      System.out.println("3. Display Product");
      System.out.println("4. To exit");
      choice = s.nextInt();
      switch (choice) {
        case 1: {
          sto.addProduct();
          break;
        }
        case 2: {
          System.out.println("Enter product name to remove from the list");
          String pro = s.next();
          try {
            sto.removeProduct(pro);
            break;
          } catch (ProductNotFoundException e) {
            System.out.println(e);
          }

        }
        case 3: {
          sto.displayProducts();
          break;
        }
        case 4: {
          System.out.println("Thank you");
          break;
        }
        default: {
          System.out.println("Enter the valid choice");
        }
      }
    } while (choice != 4);

  }
}



