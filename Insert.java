class Insert
{	public static void main(String args[])
	{	int[] arr=new int[6];
		int pos=Integer.parseInt(args[1]);
		int num=Integer.parseInt(args[0]);
		for (int i=2;i<7;i++)
		{	arr[i-2]=Integer.parseInt(args[i]);
			
		}
		for(int i=4;i>pos-2;i=i-1)
		{	arr[i+1]=arr[i];
			if (i==pos-1)
			{	arr[i]=num;
			}
		}
		for (int i=0;i<6;i++)
		System.out.println(arr[i]);
	}



}