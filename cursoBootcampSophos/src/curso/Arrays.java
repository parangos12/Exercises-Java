package curso;

public class Arrays {
	
	public static void main(String args[]) 
	{
		
		int [][] matriz= {{2,4,1},{1,2,3},{4,5,6}};
		
		for(int x=0;x<matriz.length;x++)
		{
			for(int y=0;y<matriz[x].length;y++)
			{
				System.out.println(matriz[x][y]);
			}
		}
	}

}
