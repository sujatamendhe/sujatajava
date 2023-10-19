package gitpractise;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		int org_num=s.nextInt();
		int sum=0;
		
		for(int i=org_num;i>=1;i=i/10)
		{	
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);

		if(org_num==sum)
		{
			System.out.println("number is armstrom");
		}
		else
		{
			System.out.println("number is not armstom");
		}
		
		
		
	}

}