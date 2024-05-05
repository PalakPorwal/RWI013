
class Bike {
public Bike() {
System.out.println("Segment: 1000cc");
}
public void BikeType() {
System.out.println("Bike Type: Sports");
}
}
class NinJa extends Bike {
public NinJa() 
{
System.out.println("Make NinJa");  
}
public void brand() {
System.out.println("Manufacturer: Kawasaki");
}
public void speed() {
System.out.println("Max Speed: 290Kmph");
}
}
public class MultiLevelInheritance extends NinJa {
public MultiLevelInheritance() {
System.out.println("NinJa Model: 1000R");
}
public void speed() {
System.out.println("Max Speed: 280Kmph");
}
public static void main(String args[]) {
	MultiLevelInheritance obj = new MultiLevelInheritance();
obj.BikeType();
obj.brand();
obj.speed();
}
}