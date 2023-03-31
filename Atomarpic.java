import java.util.Scanner;
class Atomarpic
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		int temp=n;
		int y=n*n;
		int count=0;
		while (n>0)
		{
			count++;
			n=n/10;
		}
        n=temp;
		int exp=1;
		for (int i=1;i<=count ;i++ )
		{
			exp=exp*10;
		}
		if (y%exp==n)
		{
			System.out.println("Given Number is Atomarphic number");
		}
		else{
			System.out.println("Given Number is not a Atomarphic number");
		}
	}
}
