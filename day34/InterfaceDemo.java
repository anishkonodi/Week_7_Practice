interface Shape{
  void draw();
}
class Triangle implements Shape{
  public void draw(){
    System.out.println("Triangle");
  }
}
class Rectangle implements Shape{
  public void draw(){
    System.out.println("Rectangle");
  }
}
class Circle implements Shape{
  public void draw(){
    System.out.println("Circle");
  }
}

class InterfaceDemo{
  public static void main(String args[]){
    Shape s=new Rectangle();
    Shape T=new Triangle();
    Shape C=new Circle();
    C.draw();
    T.draw();
    s.draw();
  }
}