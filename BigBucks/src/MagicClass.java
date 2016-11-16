import java.util.ArrayList;
import java.util.Scanner;


public class MagicClass {
	
	
	public ArrayList<BankAccount>abc=new ArrayList<BankAccount>(); 
	public void addAccount()
	{
	boolean bbb=true;
	int n=0;
	while(bbb==true)
	{
		Scanner nmTaker=new Scanner(System.in);
		System.out.println("Pleas enter the name to whom the account belongs. (Type\"EXIT\"to abort");
		String customerName=nmTaker.nextLine();
		if (customerName.toUpperCase().equals("EXIT"))
		{
			break;
		}
		Scanner moneyTaker=new Scanner(System.in);
		System.out.println("Pleas enter the amount of the deposit");
		double amountOfDeposit=moneyTaker.nextDouble();
		BankAccount myAccount=new BankAccount(customerName,amountOfDeposit);
		abc.add(n,myAccount);
		n++;
	}
	}
	public String getWinner()
	{
	double highest=0;
	double highest1=0;
	int s=0;
	for(int k=0;k<abc.size();k++)
	{
		highest=abc.get(k).getBalance();
		if (highest>highest1)
		{
			s=k;
		}
	}
	String winner=abc.get(s).getName();
	return winner;
	}

}

