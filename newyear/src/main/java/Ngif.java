package src.main.java;
import java.util.*;
public class Ngif implements Gift{

	public void inputSweets()
	{   int n,i;
		System.out.println("Enter no of gifts");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{  System.out.println("Enter name of the sweet");
		   String a1=sc.next();
		   System.out.println("Enter weight of the sweet");
		   int a=sc.nextInt();
		   if(a<=1000)
			   System.out.println("enter weight under 1000");
		   else {
			Caluculate c=new Calculate(a1,a);
			int g=c.schoc();
			if(g==0)
				System.out.println("enter valid sweet name");
		   }
			
		}
	}
}
