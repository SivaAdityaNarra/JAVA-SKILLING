import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Input_Buffer
{
         public static void main(String args[])    throws IOException
               {       
	       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	       int num=Integer.parseInt(reader.readLine());	      
	       System.out.println(num);



	}
	




}