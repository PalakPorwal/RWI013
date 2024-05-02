import java.util.Arrays;
import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= {"Palak","Madhav","Chirag","Avanti","Tani"};
		System.out.println(Arrays.toString(arr));
		
		List<String> l=new ArrayList<>();
		for(String s:arr)
		{
			l.add(s);
		}
		l.remove(4);
		System.out.println(l);
	}

}
