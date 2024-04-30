
public class DaemonThread extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("This is child thread");
	}
	
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("This is parent thread");
		DaemonThread d=new DaemonThread();
		d.setDaemon(true);
		d.start();
	}
}
