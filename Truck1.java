public class Truck1 extends Car {
 private int weight;
 
 public Truck1 (int Speed,double regularPrice,String color, int weight) {
 super(Speed,regularPrice,color);
 this.weight = weight;
 }
 
 public double getSalePrice() {
 if (weight > 2000){
 return super.getSalePrice() - (0.1 * super.getSalePrice());
 }
 else {
 return super.getSalePrice();
 }
 }
}