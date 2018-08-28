import java.io.*;
import java.util.*;
public class CatalanNumber
{
	public static void findcatlan(int n)
	{
		int []cat=new int[n+1];
		cat[1]=cat[0]=1;
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				cat[i]=cat[i]+(cat[j]*cat[i-1-j]);
			}
		}
		System.out.println(cat[n]);
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//System.out.println("Enter no of testcase");
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			findcatlan(n);
			
		}
	}
}