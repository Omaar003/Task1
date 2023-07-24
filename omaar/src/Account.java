import java.awt.*;
import java.util.Scanner;

public class Account {
    Scanner input =new Scanner(System.in);

    private String account_number;
    private String account_Name;
    public double balance_fields;

    public Account(String account_number,String account_Name,double balance_fields)
    {
        setAccount_Name(account_Name);
        setAccount_number(account_number);
        setBalance_fields(balance_fields);
    }


    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_Name() {
        return account_Name;
    }

    public void setAccount_Name(String account_Name) {
        this.account_Name = account_Name;
    }

    public double getBalance_fields() {
        return balance_fields;
    }

    public void setBalance_fields(double balance_fields) {
        this.balance_fields = balance_fields;
    }

    public void deposit(double amount)
    {

        if(amount>0) {
            balance_fields += amount;
            System.out.println("done The amount of "+ amount +" has been added to your account ");
            System.out.println("your balance now is "+ balance_fields);
        }
        else
            System.out.println("inavlid Entry");
    }

    public void withdraw(double amount)
    {

        if(amount>0&&amount<=balance_fields) {
            balance_fields -= amount;
            System.out.println( amount +" has been withdrawn from your account");
            System.out.println("your balance now is "+ balance_fields);
        }
        else
            System.out.println("inavlid Entry");
    }
    public void DisplayInfo()
    {
        System.out.println("Name : "+account_Name);
        System.out.println("Number of Account : "+account_number);
        System.out.println("Balance : "+balance_fields);
    }
}
