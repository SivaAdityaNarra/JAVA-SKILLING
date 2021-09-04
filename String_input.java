//String can also be taken by 2 arguments where we can mention Character set
// Indexing is not possible in a string
import java.lang.String;
class String_input
{	public static void main(String args[])
	{	String str1="Hello World";
		char[] arr={'H','e','l','l','o'};
		String str3=new String(arr);
		String str2= new String("Heloo Again"); 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}