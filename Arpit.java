import java.util.Scanner;
	
public class Arpit {
	



		public static void main(String[] arr)
		{
			int a, b, c, d, amt;
			a=b=c=d=0;
			
			Scanner s1 = new Scanner(System.in);
			
			System.out.print("Enter Amount: ");
			amt = s1.nextInt();
			
			if (amt%100 == 0)
			{
				while (amt>=2000)
				{
					if (amt >= 2000)
					{
						a = amt/2000;
						amt = amt%2000;
					}
				}
				
				while (amt>=500)
				{
					if (amt >= 500)
					{
						b = amt/500;
						amt = amt%500;
					}
				}
				
				while (amt>=200)
				{			
					if (amt >= 200)
					{
						c = amt/200;
						amt = amt%200;
					}
				}

				while (amt>=100)
				{
					if (amt >= 100)
					{
						d = amt/100;
						amt = amt%100;
					}
				}	
				System.out.println ("Number of 2000: " + a);
				System.out.println ("Number of 500: " + b);
				System.out.println ("Number of 200: " + c);
				System.out.println ("Number of 100: " + d);
			}
			else
			{
				System.out.println ("Enter valid amount");
			}
		}
	}


