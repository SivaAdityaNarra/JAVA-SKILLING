class even
{ 	public static void main(String args[])
	{	int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[1]);
		if (value1<value2)
		{	if (value1%2==0)
			{ 	for (int i=value1;i<=value2;i=i+2)
				{	System.out.println(i);
				}
			}
			else
			{ 	for (int i=value1+1;i<value2;i=i+2)
				{	System.out.println(i);
				}
			}
		}
		else
		{	if(value2%2==0)
			{	for (int i=value2;i<=value1;i=i+2)
				{	System.out.println(i);
				}
			}
			else
			{ 	for (int i=value1+1;i<value2;i=i+2)
				{	System.out.println(i);
				}
			}	
		}		
	}
}