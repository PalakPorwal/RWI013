import java.util.LinkedHashSet;
import java.util.Iterator;
class LinkedHashSetExample {
 
    public static void main(String args[])
    {
        LinkedHashSet<String> lhs
            = new LinkedHashSet<String>();
 
        lhs.add("Amit");
 
        lhs.add(null);
        lhs.add("Vijay");
        lhs.add("Rahul");
 
        lhs.add(null);
        lhs.add("Vijay");
 
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}