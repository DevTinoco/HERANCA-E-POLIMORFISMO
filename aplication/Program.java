package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
	Account acc = new Account(1001, "Alex", 0.0); 
	BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

	
	
	//EXEMPLO DE UPCASTING:
	
	Account acc1 = bacc;
	Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
	Account acc3 = new SavingsAccount(1004, "Tinoco",0.0, 0.01);
	
	//EXEMPLO DOWNCASTING:
	
	BusinessAccount acc4 = (BusinessAccount)acc2; //ENTRADA MANUAL DO BUSINESCCOUNT
	acc4.loan(100.0);
	
	//BusinessAccount acc5 = (BusinessAccount) acc3;
	//IMPORTANTE: DOWNCASTING NEM SEMPRE VAI DA CERTO, 
	//VAI DEPENDER D MIM PARA DA CERTO. COMO EVITAR O ERRO: TESTAR PRIMEIRO:
	if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount) acc3;
		acc5.loan(200.0);
		System.out.println("Loan");
		
	}
	
	if (acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount)acc3;
				acc5.updateBalance();
		System.out.println("Update");
		
	}
	
	
	
}
}
