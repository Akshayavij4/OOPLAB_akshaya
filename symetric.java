import java.util.Scanner;
class Symetric
{
	int a[][];
	int r,c;
	Symetric(int r,int c)
	{
		this.r=r;
		this.c=c;
	}
	void read()
	{
		System.out.println("Enter the elements");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	void check()
	{
		int flag=0;
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					 flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("This is not symetric");
		    
		}
		else
		{
			System.out.println("This is Symetric");
		}
	}
	public static void main(String ab[])
	{
		System.out.println("Enter number of rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int k=sc.nextInt();
		Symetric m=new Symetric(j,k);
		m.a=new int[j][k];
		m.read();
		m.check();
	}
}




