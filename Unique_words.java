import java.util.Scanner;
import java.lang.String;

class Unique_Words
{	public static void main(String args[])
	{	Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		String[] words;
		int word_index=0;
		String Temp;
		
		for(int index=0;index<str.length();index++)
		{	if(str.charAt(index)==' ')
			{	words[word_index]=Temp;
				word_index=word_index+1;
				Temp="";
				
			}
			else
			{	Temp=Temp.concat(String(str.charAt(index)));
			}
		}
		int i=0;
		int u_count=0;
		int length=words.length();
		String[] unique_words;
		while(i<length)
		{	if (str.indexOf(words[i])!=str.lastIndexOf(words[i]))
			{	i=i+1;
			}
			else
			{      unique_words[u_count]=words[i];
			        i=i+1;
			}
		}
		
		 System.out.println(unique_words);
		
		

	}
}