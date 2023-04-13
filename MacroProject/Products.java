class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
class PointOfSale {
    private Product[] products;
    private int numProducts;
    public PointOfSale() {
        this.products = new Product[10];
        this.numProducts = 0;
    }
    void addProduct(Product product) {
        if (numProducts < products.length) {
            products[numProducts] = product;
            numProducts++;
        } else {
            System.out.println("Error: Point of Sale is full");
        }
    }
    void removeProduct(Product product) {
        int index = -1;
        for (int i = 0; i < numProducts; i++) {
            if (products[i] == product) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numProducts - 1; i++) {
                products[i] = products[i + 1];
            }
          products[numProducts - 1] = null;
          numProducts--;
        }
       else
          System.out.println("not found");
    }
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < numProducts; i++) {
            totalCost += products[i].getPrice() * products[i].getQuantity();
        }
        return totalCost;
    }
}
class Products{
  public static void main(String args[]){
    PointOfSale s1=new PointOfSale();
    Product p1=new Product("abc",4562,8);
    Product p2=new Product("shdb",278,10);
    s1.addProduct(p1);
    s1.addProduct(p2);
    System.out.println(s1.getTotalCost());
    s1.removeProduct(p2);
  }
}