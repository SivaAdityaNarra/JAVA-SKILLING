import java.io.BufferReader;
import java.io.InputStreamReader;
import java.io.IOException;
class temp
{  	public static void main(String args[])
	{	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter temp");
		double temp=Double.parseDouble(reader.readline());
		System.out.println(temp);
	}

}