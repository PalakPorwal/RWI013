
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A{
	int pid;
	String PName;
	String desc;
	String empid;
	public A(int pid, String name, String empid, String desc) {
		this.pid = pid;
	    this.PName = name;
	    this.empid=empid;
		this.desc = desc;
	}
	
}

public class Project {

	public static void main(String[] args) {
		List<A>projectList=new ArrayList<A>();
		projectList.add(new A(1,"Order Management","RWI140","Rewa"));
		projectList.add(new A(2,"Online Grocery Store","RWI131","Anuppur"));
		projectList.add(new A(3,"Blood Bank","RWI132","Durg"));
		projectList.add(new A(4,"Blog Application","RWI127","Bhilai"));
		projectList.add(new A(5,"Algo Trading","RWI151","Durg"));
		
		List<Integer> list=projectList.stream()
                           .filter(p->p.pid>3) 
                           .map(m->m.pid).
                           collect(Collectors.toList());
		System.out.println(list);
		
		             
		
		

	}

}
