package oct2nd;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int[][] b=new int[2][5];
		
		//b.length will give no of rows in that array 
		for(int i=0;i<b.length;i++)
		{
			
			//b[i].length ==> this will give no of cols or items in b[i] row
			for(int j=0;j<b[i].length;j++)
			{
				
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[0][3]=4;
		b[0][4]=5;
		
		
		
				for(int i=0;i<b.length;i++)
				{
					
					
					for(int j=0;j<b[i].length;j++)
					{
						
						System.out.print(b[i][j]+" ");
						
					}
					System.out.println();
				}
		
				//b[1][0]=1;
				//	b[1][1]=4;
				//b[1][2]=9;
				//b[1][3]=16;
				//b[1][4]=25;
					
					
					for(int j=0;j<b[0].length;j++)
					{
						
						//	b[1][j]=b[0][j]*b[0][j];
						
						b[1][j]=(int) Math.pow(b[0][j], 3);
						
					}
				
					
					for(int i=0;i<b.length;i++)
					{
						
						
						for(int j=0;j<b[i].length;j++)
						{
							
							System.out.print(b[i][j]+" ");
							
						}
						System.out.println();
					}

	}

}
