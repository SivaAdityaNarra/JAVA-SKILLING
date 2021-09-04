class S_67
{
	public static void main(String args[])
	{	int flag=0;
		int sum=0;
		int rsum=0;
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{	arr[i]=Integer.parseInt(args[i]);
			sum=sum+arr[i];
			if (arr[i]==6)
			{	flag=1;
				rsum=rsum+6t;
			}	
			else if(arr[i]==7 && flag==1)
			{	flag=0;
				rsum=rsum+7;
				sum=sum-rsum;
			}
			else if(flag==1)
			{
				rsum=rsum+arr[i];
			}
		}
		System.out.println(sum)
	}




}