package Main;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
//		ask a average number and system.out all numbers higher than average number
		
		double sum = 0;
		int cnt =0;
		cnt= in.nextInt();
		if (cnt>0)
		{
			
		
			int []numbers= new int [cnt];
			for (int i=0;i<cnt;i++)
			{
				numbers[i]=in.nextInt();
				sum+=numbers[i];
				
			}
			double average=sum/cnt;
			for (int i=0; i<cnt; i++)
			{
				if (numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(average);
		}
		
	}

}
