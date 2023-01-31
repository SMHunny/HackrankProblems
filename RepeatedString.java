package javacode.projects.basiccode.sourabh;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args)
	
	{	
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		long n=sc.nextLong();
		long len=str.length();
		long mod= n%len;
		sc.close();
		if(mod==0)
		{	
			System.out.println(getcount(str,len)*(n/len));
		}
		else
		{
		
		System.out.println(getcount(str,mod)+(((int)(n/len))*getcount(str,len)));
		}
		

	}
	public static long getcount(String str, long strlen)
	{
		int count=0;
		for (int i =0;i<strlen;i++)
			if(str.charAt(i)=='a')
			{
				count++;
			}
		return count ;
		
	}

}

