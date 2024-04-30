
public class GetNameThread extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread task1");
	}
	
	public void runs()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String args[])
	{
	 GetNameThread t=new GetNameThread();
	 t.start();
	 t.runs();
	 System.out.println(Thread.currentThread().getName());
	}
}
