package projectRelatedPackage;

public class SecondHighestNumber {

	public static void main(String[] args) {
		System.out.println(main(new int[] {2,5,10,3}));
		

	}
	public static int main(int[] arr)
	{
		int first=Integer.MIN_VALUE; int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			if(arr[i]>second && arr[i]<first)
			{
				second=arr[i];
			}
			
		}
		return second;
	}

}
