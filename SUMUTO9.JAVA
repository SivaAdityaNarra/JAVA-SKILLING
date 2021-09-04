class SUMUPTO9
{ public static void main(String args[])
	{ 	int [] array = new int[10];
		int min=0;
		int sum=0;
	  	for (int i=0; i<10;i++)
		{	 array[i]=Integer.parseInt[args[i]];
			sum=sum+array[i];
		 	 if(i==0)
			{ min=array[i];
			}
			else
			{	 if min>array[i]
				{	min=array[i];
				}
			}
		}
		System.out.println(sum-min);
	}
}