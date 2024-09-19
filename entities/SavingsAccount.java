package entities;
                            //HERANÇA 
public class SavingsAccount extends Account{

	private Double interestRate;
	
	//CONSTRUTOR PADRAO DA SAVINGSACOUNT
	public SavingsAccount() {
		super();
		
	//CRIAR O CONSTRUTOR COM ARGUMENTO
	
	
	}

	public SavingsAccount(Integer number, String holder, Double balance,Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
