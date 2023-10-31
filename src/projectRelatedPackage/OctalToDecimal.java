package projectRelatedPackage;

public class OctalToDecimal {

	public static void main(String[] args) {
		System.out.println(decimalConversion(10));
		

	}
	public static int decimalConversion(int n)
	{
		int power=0;
		int octal=0;
		while(n!=0)
		{
			octal+=(n%10)*((int)Math.pow(8, power));
			n=n/10;
			power++;
		}
		return octal;
	}

}
