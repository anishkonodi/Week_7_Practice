class InvalidDimensionException extends Exception{
  InvalidDimensionException(String str){
    super(str);
  }
}
class Circle{
  void area(int rad) throws InvalidDimensionException{
  if(rad<=0){
  throw new InvalidDimensionException("Invalid radius");
  }
else{
  double area=3.14*rad*rad;
  System.out.println("Area of circle is :"+area);
}
  }
  void perimeter(int rad) throws InvalidDimensionException{
    if(rad<=0){
  throw new InvalidDimensionException("Invalid radius");
  }
else{
  double peri=2*3.14*rad;
  System.out.println("Perimeter is :"+peri);
}
  }
}
class Rectangle{
  void area(int len,int wid) throws InvalidDimensionException{
    if(len<=0 || wid<=0){
      throw new InvalidDimensionException("Invalid dimensions");
    }
    else{
      int area=len*wid;
      System.out.println("area of rectangle is:"+area);
    }
  }
  void perimeter(int len,int wid) throws InvalidDimensionException{
     if(len<=0 || wid<=0){
      throw new InvalidDimensionException("Invalid dimensions");
    }
    else{
      int peri=2*(len+wid);
      System.out.println("perimeter is:"+peri);
    }
  }
}
class ShapeDemo{
  public static void main(String args[]){
    Circle c=new Circle();
    Rectangle r=new Rectangle();
    try{
      c.area(5);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      c.perimeter(0);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      r.area(5,3);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
    try{
      r.perimeter(5,3);
    }
    catch(InvalidDimensionException e){
      System.out.println(e);
    }
  }
}