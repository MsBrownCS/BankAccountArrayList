import java.util.ArrayList;


public class BankAccount
{
	public String name;
	public double balance;
	public ArrayList<BankAccount>abc=new ArrayList<BankAccount>(); 
	public BankAccount(String nm, double amt)
	{
		name = nm;
		balance = amt;
	}


	public void deposit(double dp)
	{
		balance = balance + dp;
	}


	public void withdraw(double wd)
	{
		balance = balance - wd;
	}
	
	public String getName()
	{
		return name;
	}
	public double getBalance()

	{
		return balance;
	}

}

