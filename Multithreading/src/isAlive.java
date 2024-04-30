
public class isAlive extends Thread{

	public void run()
	{
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		isAlive thread=new isAlive();
		System.out.println("thread is started or not : "+thread.isAlive());
		thread.start();
		
		System.out.println("after starting the thread : "+thread.isAlive());
	}
}
