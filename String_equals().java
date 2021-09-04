import java.lang.String;
class String_equals
{	public static void main(String args[])
	{	String s1="HE";
		String s2="HE";
		String s3=new String("HE");
		String s4=new String("HE");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s1==s2);
	}

}