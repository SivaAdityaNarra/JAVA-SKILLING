import java.util.Scanner;
import java.lang.Math;
class C_1_10Prime
{
	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		int[] arr=new int[10];
		int count=0;
		int i=0;
		while (count<11 && i!=-1)
		{ 	i=reader.nextInt();
			int flag=0;
			if (i%2==0)
			{ 	
				flag=1;
			}
			else
			{
				for(int j=3;j<=Math.sqrt(i);j++)
				{	if(i%j==0)
					{	flag=1;
						break;
					}
				}
					
			}
			if(flag==0)
			{	arr[count]=i;
				count=count+1;
			}	
		}
		for(int j=0;i<=count;i++)
		{
		System.out.println(arr[i]);
		}
	}

}