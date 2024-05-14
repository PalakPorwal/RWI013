
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class S{
	int sid;
	String Name;
	String rollNo;
	String address;
	public S(int sid, String name, String rollNo, String address) {
		this.sid = sid;
	    this.Name = name;
		this.rollNo = rollNo;
		this.address = address;
	}
	
}

public class StreamApi {

	public static void main(String[] args) {
		List<S>studentList=new ArrayList<S>();
		studentList.add(new S(1,"palak","RWI140","indore"));
		studentList.add(new S(2,"madhav","RWI131","agar"));
		studentList.add(new S(3,"avanti","RWI132","bhopal"));
		studentList.add(new S(4,"chirag","RWI127","khandwa"));
		studentList.add(new S(5,"tani","RWI151","dewas"));
		
		List<Integer>statelist=studentList.stream()
                           .filter(p->p.sid>3)//Filtering
                           .map(m->m.sid).//fetching
                           collect(Collectors.toList());
		System.out.println(statelist);
		
		             
		
		

	}

}
