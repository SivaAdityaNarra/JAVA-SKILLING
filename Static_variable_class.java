class Static_variable_class
{	
	static int a=10;
	void add(int no)
	{	a=a+no;
	
	}
}

class Main_Static_variable_class
{	public static void main(String args[])
	{	
		Static_variable_class  v1= new Static_variable_class();
		Static_variable_class  v2= new Static_variable_class();
		v1.add(30);
		v2.add(20);
		System.out.println(v1.a);
		System.out.println(v2.a);
	}	


}