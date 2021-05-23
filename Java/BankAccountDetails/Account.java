public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    public Account(Account ob){
        this.accountId = ob.accountId;
        this.accountType = ob.accountType;
        this.balance = ob.balance;
    }
    public Account(){
        this.accountId=0;
        this.accountType="";
        this.balance=0;
    }
    public boolean withdraw(int amt){
        if(this.balance<amt){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        else{
            this.balance-=amt;
            System.out.println("Balance amount after withdraw:"+this.balance);
            return true;
        }
    }
    public int getAccountId(){
            return this.accountId;
    }
    public void setAccountId(int id){
        this.accountId = id;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public void setAccountType(String type){
        this.accountType=type;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int bal){
        this.balance = bal;
    }
}