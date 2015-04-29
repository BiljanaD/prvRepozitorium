
public class Proba {
	static void oddEvenSort(int a[], int n)
	{
		
		int parni[]= new int[50];
		int neparni[]= new int[50];
		int h=0;
		int g=0;
		for(int i=0; i< a.length; i++)
		{
			if(a[i] %2 ==0)
			{   int t=parni[h];
				parni[h]= a[i];
				t=a[i];
				h++;
			}
			if (a[i] %2 != 0)
			{
		      a[i]=neparni[g];
		      g++;
		     }
			System.out.println(neparni[i]+ "   " +i);
			System.out.println(parni[i]+ "   " +i);
			}
		
		
		
		
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int parni[]= new int[10];
		int neparni[]= new int[10];
		int h=0;
		int g=0;
		for(int i=0; i< a.length; i++)
		{
			if(a[i] %2 ==0)
			{   System.out.println(a[i] + "paren");
				
			}
			if (a[i] %2 != 0)
			{
				System.out.println(a[i] + "neparen");;
		     }
			
			}
		
       
	}

}
