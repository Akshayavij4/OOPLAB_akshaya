import java.util.Scanner;
class Matrix
{ 
	int m,n;
	int a[][];
	Matrix(int x,int y)
	{
		this.m=x;
		this.n=y;
	}
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of a matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}	
	}	
	void add(Matrix M1,Matrix M2)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 a[i][j]=M1.a[i][j]+M2.a[i][j];
			}    	 
		}
	}
	void display()
	{
		System.out.println("The sum of matrix is\n");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}     
	}			
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and coloumns of matrix");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Matrix M1=new Matrix(x,y);
		M1.a=new int[x][y];
		M1.read();
		Matrix M2=new Matrix(x,y);
		M2.a=new int[x][y];
		M2.read();
		Matrix M3=new Matrix(x,y);
		M3.a=new int[x][y];
		M3.add(M1,M2);
		M3.display();		
	}
}




