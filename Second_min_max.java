class Second_min_max
{
	public static void main(String args[])
	{	int[] arr= new int[10];
		int max=0;
		int min=0;
		int smin=Integer.MAX_VALUE;
		int smax=Integer.parseInt(args[0]);
		max=Integer.parseInt(args[0]);
		min=Integer.parseInt(args[0]);
		for(int i=1;i<10;i++)
		{	arr[i]=Integer.parseInt(args[i]);
			if(max<arr[i])
			{	smax=max;
				max=arr[i];
			}
			else if ( arr[i]>smax)
			{	smax=arr[i];
			}
			if(min>arr[i])
			{	smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin)
			{	smin=arr[i];
			}
		}
		System.out.println("MIN VALUES"+min+" "+smin);
		System.out.println("MAX VALUES"+max+" "+smax);
	}
}