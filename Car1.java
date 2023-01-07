public class Car1{
 private int Speed;
 private double regularPrice;
 private String color;
 
 public Car1 (int Speed,double regularPrice,String color) {
 this.Speed = Speed;
 this.regularPrice = regularPrice;
 this.color = color;
 }
     public double getSalePrice(){
         return regularPrice;
     }
}
