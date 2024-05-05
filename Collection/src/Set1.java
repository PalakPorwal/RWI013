import java.util.*;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s=new HashSet<>();
		s.add("palak");
		s.add("palak");
		s.add("madhav");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
