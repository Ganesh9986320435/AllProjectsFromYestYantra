package log4j;

public class Person {
	private long account_no;
	private String bank;
	private double bal;
	private String pass;
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Person [account_no=" + account_no + ", bank=" + bank + ", bal=" + bal + ", pass=" + pass + "]";
	}
	
}
