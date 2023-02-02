package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Enter value for startAmount: ");
		int startAmount = in.nextInt();

		System.out.print("Enter value for winChance: ");
		double winChance = in.nextDouble();

		System.out.print("Enter value for winLimit: ");
		double winLimit = in.nextDouble();


		int MoneyIHaveNow = startAmount;

		for (int totalSimulation=10; totalSimulation > 0; totalSimulation--)
		{
			while (MoneyIHaveNow>0 && MoneyIHaveNow < winLimit)
			{
				double N = Math.random();
				if(N < winChance)
				{MoneyIHaveNow += 1;
				}
				else;
				{
					MoneyIHaveNow -= 1;
				}
			}
		}}}



