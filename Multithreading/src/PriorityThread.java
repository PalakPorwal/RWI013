
public class PriorityThread extends Thread {

	public void run()
	{
		System.out.println("This is child thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());
		PriorityThread p=new PriorityThread();
		p.start();
		p.setPriority(MAX_PRIORITY);
	}
}
