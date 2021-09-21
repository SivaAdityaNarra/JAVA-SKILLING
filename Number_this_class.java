class Number_this
{	int no=0;
	int add(int no)
	{	this.no=this.no+no;
		return (this.no);
	}



}
class Main_this
{	public static void main(String args[])
	{	Number n1=new Number();
		int res=n1.add(20);
		System.out.println(res);
	}


}