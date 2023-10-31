package exceptionHanldingConcept;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try
		{
			int num=Integer.parseInt("-1");
			System.out.println(num);
		}
		catch(NumberFormatException n)
		{
			System.out.println("Catching the Parent Exception");
			
		}
		catch(RuntimeException r)
		{
			System.out.println("Catching the Number Format Exception");
		}
		finally {
			System.out.println("Either try or catch block might have executed..");
		}
		System.out.println(getTheCore("Alicia"));
	}
		@SuppressWarnings("finally")
		public static int getTheCore(String sName)
		{
			
			if(sName.equalsIgnoreCase("Alicia"))
			{
				int num=0;
				try {
				num=40/0;
				return 40;
				}
				catch(ArithmeticException a)
				{
					return num=30;
				}
				finally {
					return num=50;
				}
			
			
		}
			return -1;
		

	}

	

}
