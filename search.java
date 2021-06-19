import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		int[] a=new int[100];
		int i,n,search;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to searched:");
		search=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(search==a[i])
			{
				System.out.println(search+" Element found at "+i+" position");
				break;
			}
			if(i==n)
				System.out.println("Element not found");
		}
	}

}






