public class Challenge3
	{

		public static void main(String[] args)
			{
					{
						int arrayName[][] = new int[3][3];
						arrayName[0][0] = 1;
						arrayName[0][1] = 2;
						arrayName[0][2] = 3;
						arrayName[1][0] = 4;
						arrayName[1][1] = 5;
						arrayName[1][2] = 6;
						arrayName[2][0] = 7;
						arrayName[2][1] = 8;
						arrayName[2][2] = 9;
						for(int row=0;row<arrayName.length;row++)
							{
								for(int col=0; col<arrayName[0].length;col++)
									{
										System.out.print(arrayName[row][col]);		
									}
								
							}	
					}

			}
	}
