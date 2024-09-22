package com.deloitte.lab4.ex1;

class Person{
	
	String name;
	float age;
	
	public Person(String name, float age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}

class Account {
	
	public Account(double balance, Person person)
	{
		if (balance < 500)
			System.out.println("Mimumum balance 500 needed");
		else
		{
			this.balance = balance;
			this.person = person;
			this.accNum = accNum++;
		}
	}
	
	private static int accNum = 1;
	double balance;
	Person person;
	
	void deposit(double amount) {
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Amount deposited");}
		
	}
	void withdraw(double amount) {
		if(amount > 0 && amount < balance)
		{
			balance -= amount;
			System.out.println("Amount withdrawn");
		}
		
	}
	
	double getBalance() {
		return balance;
	}
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

class SavingsAccount extends Account{
	
	public SavingsAccount(double balance, Person person) {
		super(balance, person);
		// TODO Auto-generated constructor stub
	}

	private final double min_balance = 500.0;
	
	@Override
	public void withdraw(double amount)
	{
		if(amount > 0 && amount < balance && (balance-amount > min_balance))
		{
			balance -= amount;
			System.out.println("Amount withdrawn");
		}
	}
}
	
class CurrentAccount extends Account{
	
	public CurrentAccount(double balance, Person person) {
		super(balance, person);
		// TODO Auto-generated constructor stub
	}

	double overdraftLimit;
	
	@Override
	public void withdraw(double amount)
	{
		if(amount < balance && amount < overdraftLimit)
			System.out.println("Withdrawl successful");
		else
			System.out.println("Overdraftlimit exceeded");
	}
}


public class Lab4Ex1 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Kathy", 28);
		Person p2 = new Person("Smith", 42);
		
		Account smithAcc = new Account(2000, p1);
		Account kathyAcc = new Account(3000, p2);
		
		smithAcc.deposit(2000);
		System.out.println("Final balance: "+ smithAcc.getBalance());
		
		kathyAcc.withdraw(2000);
		System.out.println("Final balance: "+ kathyAcc.getBalance());
		
	}
		
		
		
}
