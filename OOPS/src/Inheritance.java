class Student {
void Play() {
System.out.println("Playing Fooball...");
}
}
class Bob extends Student {
void Study() {
System.out.println("Studing Physic...");
}
}
public class Inheritance {
public static void main(String args[]) {
Bob d = new Bob();
d.Study();
d.Play();
}
}