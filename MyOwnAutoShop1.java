public class MyOwnAutoShop1 {
// (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) 
 public static void main(String[] args) {
 Sedan mySedan = new Sedan(160, 20000, "Red", 10);
 Ford1 myFord1 = new Ford1 (156,4452.0,"Black",2005, 10);
 Ford1 myFord2 = new Ford1 (155,5000.0,"Pink",1998, 5);
 Car1 myCar = new Car1 (555, 56856.0, "Red"); 
 System.out.printf("MySedan Price %.2f", mySedan.getSalePrice());
 System.out.printf("MyFord1 Price %.2f", myFord1.getSalePrice());
 System.out.printf("MyFord2 Price %.2f", myFord2.getSalePrice());
 System.out.printf("MyCar Price %.2f", myCar.getSalePrice());
 }
}