import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Buffer_Input_Addition
{
       public static void main(String args[]) throws IOException
           {	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(reader.readLine());
	int b=Integer.parseInt(reader.readLine());
	System.out.println(a+b);

           }


}