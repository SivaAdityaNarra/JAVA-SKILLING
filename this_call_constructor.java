class this_call_constructor
{	this_call_constructor()
	{	this("HLO");
		System.out.println("Default constructor");
		
	}
	this_call_constructor(String st)
	{	System.out.println("THis is one argument constructor");
		
	}
	
}

class Main_this_call
{	public static void main(String args[])
	{	this_call_constructor t1=new this_call_constructor();
	}



}