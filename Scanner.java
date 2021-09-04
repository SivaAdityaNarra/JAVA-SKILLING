import java.util.Scanner;

class InputScanner
{
	public staic void main(String args[])
	{	Scanner obj=new Scanner(System.in);
		int reg=obj.nextInt();
		int sub1=obj.nextInt();
		int s2=obj.nextInt();				
		int s3=obj.nextInt();
		String name=obj.nextLine();
		int total=0;
		total=sub1+s2+s3;
		double avg=0.0;
		avg=total/3;
		 Systemout.println(total+" "+avg)

	}

}