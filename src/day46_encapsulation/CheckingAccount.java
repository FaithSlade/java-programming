package day46_encapsulation;

public class CheckingAccount {
    private  double balance;
    private long accountNumber;
    private String accountHolder;
    private String type = "chaecking";//default is checking, we can change if needed using setter

    /**
     * public void setAccountInfo(long accountNumber, String accountHolder, double balance, String type)
     * 1) this.accountNumber = accountNumber;
     * 2) setAccountNumber(accountNumber);
     */

    //short cut
    //right click >> generate >> setter and getter >> shift + click on the last one >> Select all >> ok
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
