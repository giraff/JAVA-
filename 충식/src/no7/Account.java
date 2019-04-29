package no7;

public class Account {

	public static String account;//계좌번호
	public int balance; //잔액
	public double interestRate;//이율
	
	//기본생성자
	public Account() {

	}
	//3개 클래스변수를 받는 생성자
	public Account(String account, int balance,double interestRate) {
		this.account=account;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	//계좌번호 셋팅
	public void setAccount(String account) {
		this.account=account;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//계좌번호 리턴
	public String getAccount() {
		return this.account;
	}
	//잔액정보 리턴
	public int getBalance() {
		return this.balance;
	}
	//현재 잔액을 기준 이자계산
	public double calculateInterest() {
		return (this.balance*this.interestRate);
	}
	//입급을 통해 잔액정보 증가
	public void deposit(int money) {
		this.balance+=money;
	}
	//출금 통해 잔액정보 감소
	public void withdraw(int money) {
		this.balance-=money;
	}
	
}
