import java.util.Scanner;
public class AccountDetails{
    public Account getAccountDetails(){
        Account ob = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        int accountId = sc.nextInt();
        sc.nextLine();
        ob.setAccountId(accountId);
        System.out.println("Enter account type:");
        String accountType = sc.nextLine();
        ob.setAccountType(accountType);
        int balance;
        do{
            System.out.println("Enter balance:");
            balance = sc.nextInt();
            if(balance<=0)
                System.out.println("Balance should be positive");
        }while(balance<=0);
        ob.setBalance(balance);
        return ob;
    }
    public int getWithdrawAmount(){
        int amt;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter amount to be withdrawn:");
            amt = sc.nextInt();
            if(amt<=0)
                System.out.println("Amount should be positive");
        }while(amt<=0);
        return amt;
    }
    public static void main (String[] args) {
        AccountDetails ad = new AccountDetails();
        Account ac = new Account(ad.getAccountDetails());
        int amt = ad.getWithdrawAmount();
        boolean withdrawn=ac.withdraw(amt);
    }
}