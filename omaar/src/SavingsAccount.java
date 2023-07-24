public class SavingsAccount extends Account {
    public double interestRate;
    SavingsAccount(String account_number,String account_Name,double balance_fields,double interestRate)
    {
        super(account_number,account_Name,balance_fields);
        this.interestRate=interestRate;
    }
    public double CalculateInterest()
    {
        return (getBalance_fields()*interestRate);
    }


}
