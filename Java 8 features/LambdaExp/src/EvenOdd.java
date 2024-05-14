interface start
{
	public void run(int x);
}
public class EvenOdd {

	public static void main(String args[])
	{
		start s=(x)->
		{
			if(x%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		};
		s.run(29);
	}
}
