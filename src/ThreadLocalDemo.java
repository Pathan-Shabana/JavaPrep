
public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal<String> threadlocal= new ThreadLocal<>();
		
		Thread t1= new Thread(()->{
			threadlocal.set("Thread1");
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
		e.printStackTrace();}
		String value=threadlocal.get();
		System.out.println(value);
		});
		Thread t2= new Thread(()->{
			threadlocal.set("Thread2");
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
		e.printStackTrace();}
		String value=threadlocal.get();
		System.out.println(value);
		});
		t1.start();
		t2.start();
		
		}

	}


