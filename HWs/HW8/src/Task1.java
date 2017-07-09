import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter sentence of five words");
			String sentence = br.readLine();
			String[] str1 = sentence.split(" ");
			
			
			int max = str1[0].length();
			int imax=0;
			
			for(int i=0; i<str1.length;i++)
			{
				if(str1[i].length()>max)
				{
					max= str1[i].length();
					imax=i;
					
				}
			}
			System.out.println( " The longest word in the sentence: " + str1[imax]);
		
			int n=0;
			for(int i=0; i<str1.length;i++)
			{
				n+=str1[i].length();
			}
			System.out.println( " the number of sentence letters: " + n);
			
			String reverse = new StringBuffer(str1[1]).reverse().toString();
			System.out.println("the second word in reverse order: " + reverse);
		
	}

}
