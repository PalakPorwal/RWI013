
interface  start1{
	public void show(int x,int y);
}

public class LambdaExp{

	public static void main(String[] args) {
		
		start1 s1=(x,y)->{
			System.out.println(x*y);
		};
		s1.show(19, 7);
	
	}

}
