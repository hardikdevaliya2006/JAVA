import java.util.Scanner;

class matrixMulti
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The No Of Rows For First Matrix : ");
		int r1 = sc.nextInt();

		System.out.println("Enter The No Of Column For First Matrix : ");
		int c1 = sc.nextInt();

		System.out.println("Enter The No Of Rows For Second Matrix : ");
		int r2 = sc.nextInt();

		System.out.println("Enter The No Of Column For Second Matrix : ");
		int c2 = sc.nextInt();

		int a1[][] = new int[r1][c1];
		int b1[][] = new int[r2][c2];
		int c[][] = new int[r1][c2];
		
		System.out.println("Enter The Value Of First Matrix : ");

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter The Value Of Second Matrix : ");

		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b1[i][j] = sc.nextInt();
			}
		}

		if (c1!=r2){
			System.out.println("Matrix maltipication not Possible");
			return;
		}

		System.out.println("Matrix maltipication is : ");

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					c[i][j]+=a1[i][k]*b1[k][j];
				}
			}
		}
	
		System.out.println("The Result Matrix Is : ");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.printf(" c[%d][%d] : %d ",i,j,c[i][j]);
			}
			System.out.println();
		}		
	}
}