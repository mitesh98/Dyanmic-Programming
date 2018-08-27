import java.io.*;
import java.util.*;
import java.lang.Math;
public class Ugly_Number
{
	public static int ugly_number(int n)
	{
		int[] a=new int[n];
		a[0]=1;
		int i2=0,i3=0,i5=0;
		int next_multiple_of_2=a[i2]*2;
		int next_multiple_of_3=a[i3]*3;
		int next_multiple_of_5=a[i5]*5;
		for(int i=1;i<n;i++)
		{
			int next_ugly_no=Math.min(next_multiple_of_2,Math.min(next_multiple_of_3,next_multiple_of_5));
			a[i]=next_ugly_no;
			if(next_ugly_no==next_multiple_of_2)
			{
				i2=i2+1;
				next_multiple_of_2=a[i2]*2;
			}
			if(next_ugly_no==next_multiple_of_3)
			{
				i3=i3+1;
				next_multiple_of_3=a[i3]*3;
			}
			if(next_ugly_no==next_multiple_of_5)
			{
				i5=i5+1;
				next_multiple_of_5=a[i5]*5;
			}
			
		}
		return a[n-1];
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//System.out.println("Enter no of testcase");
		int n=in.nextInt();
		System.out.println(ugly_number(n));
		

	}
}