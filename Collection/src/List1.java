import java.util.*;
import java.util.Iterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<>();
		al.add("palak");
		al.add("arnav");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
