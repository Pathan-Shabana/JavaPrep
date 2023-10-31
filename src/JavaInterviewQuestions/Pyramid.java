package JavaInterviewQuestions;

public class Pyramid {
	public static void main(String[] args)
	{
		drawpyramid(3);
		
	}
	public static void drawpyramid(int rows)
	{
		int num=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}

}
