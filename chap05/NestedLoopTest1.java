public class NestedLoopTest1{
	public static void main(String args[]) 
	{
		int i=2;
		while ( i <= 9 )
		{
			System.out.println("*** "+ i + "�� ***");
			for (int j=1; j<=9 ; j++)
			{
				System.out.println((i+" * " + j + " = " + i*j));
			}
			System.out.println();
			i++;
		}
	}
}