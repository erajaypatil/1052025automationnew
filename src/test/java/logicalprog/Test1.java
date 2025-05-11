package logicalprog;

public class Test1 {

	public static void main(String[] args) {
		
		
		//shift zero to right sides
		
		int a[]= {1,0,2,3,0,4,0,5};
		int count=0;
		int index=0;
		int a1[]=new int[a.length];
		/*
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		*/
		
		
		//System.out.println(count);
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				a1[index]=a[i];
				index++;
			} 
			//System.out.println(a1[i]+" ");
			
		}
		
		
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]+" ");
		}
		

	}

}
