// Two arguments can be given (string2, starting index for searching);

import java.lang.String;
class String_indexOf
{	public static void main(String args[])
	{	String s=new String("HLO WOrld");
		String s1=new String("O");
	
		System.out.println(s.indexOf(s1,3));
		System.out.println(s.lastIndexOf(s1,4));
	}

}