import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {

	public static void main(String args[])
	{
		LinkedList<String> al=new LinkedList<>();
		al.add("palak");
		al.add("arnav");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
