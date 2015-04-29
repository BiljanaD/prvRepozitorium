
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSort {
	
	static void oddEvenSort(int a[], int n)
	{
		
		int parni[]= new int[50];
		int neparni[]= new int[50];
		int h=0;
		int g=0;
		for(int i=0; i< a.length; i++)
		{
			if(i %2 ==0)
			{
				parni[h]=i;
				h++;
			}
			if (i %2 != 0)
			{
		      neparni[g]=i;
		      g++;
		     }
			}
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException{
		int i;
		BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in)); 
		String s = stdin.readLine();
		int n = Integer.parseInt(s);
		
		s = stdin.readLine();
		String [] pom = s.split(" ");
		int [] a = new int[n];
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(pom[i]);
		oddEvenSort(a,n);
		for(i=0;i<n-1;i++)
			System.out.print(a[i]+" ");
		System.out.print(a[i]);
	}
}