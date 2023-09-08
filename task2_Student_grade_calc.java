import java.util.*;
class task1
{
	public static void main(String []w)
	{
		int n,i,total=0;
		float percentage;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of subjects: ");
		n=sc.nextInt();
		int m[]=new int[n];
		System.out.println("Enter marks of subjects (out of 100): ");
		for (i=0; i<n;i++)
		{
			System.out.print("Subject "+(i+1)+": ");
			m[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			total=total+m[i];
		}
		System.out.print("Total marks obtained: "+total);
		percentage=total/n;
		System.out.println("\nAverage Percentage: "+percentage+"%");

		if(percentage>=95.0)
			System.out.println("Grade : A+");
		else if(percentage>=90.0)
			System.out.println("Grade : A");
		else if(percentage>=80)
			System.out.println("Grade : B+");			
		else if(percentage>70.0)
			System.out.println("Grade : B");
		else if(percentage>=50.0)
			System.out.println("Grade : C");
		else if(percentage>=33.0)
			System.out.println("Grade : D");
		else
			System.out.println("FAIL");
	}
}
