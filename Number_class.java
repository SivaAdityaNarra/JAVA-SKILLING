class Number
{	int no=0;
	int add(int no)
	{	no=no+no;
		return no;
	}



}
class Main
{	public static void main(String args[])
	{	Number n1=new Number();
		int res=n1.add(10);
		System.out.println(res);
	}


}