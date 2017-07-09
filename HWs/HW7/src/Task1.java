import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> col1 = new HashSet<Integer>( );
		Set<Integer> col2 = new HashSet<Integer>( );
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			col1.add(rand.nextInt(10));
		}
		
		for (int j = 0; j < 10; j++) {
			col2.add(rand.nextInt(10));
		}
		for(int a:col1)
		{System.out.print(" col1 "+a);}
		System.out.println();
		
		for(int b:col2)
		{System.out.print(b);}
		
		for (int i = 0; i < 10; i++) {
			col2.add(rand.nextInt(10));
		}
		
		System.out.println();
		union(col1,col2);
		intersect(col1,col2);
	}
	
	
	public static  void union(Set<Integer> set1, Set<Integer> set2) 
	{
		Set<Integer> ucol = new  HashSet<Integer>( );
		
		for(int c:set1)
		{
			ucol.add(c);
		}
		
		for(int d:set2)
		{
			ucol.add(d);
		}
		
		for(int e:ucol )
		{
			System.out.print(e+" ");
		}
		
	}
	public static void intersect(Set<Integer> set1, Set<Integer> set2)
	{
	Set<Integer> icol = new  HashSet<Integer>( );
		
		for(int f:set1)
		{
		 for(int g:set2)
		 {
			 if(f==g)
			 {
				 icol.add(f); 
			 }
		 }
		}
		System.out.println();
		for(int h:icol )
		{
			System.out.print(h+" ");
		}
		
	}

}
