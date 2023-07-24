public class Bank {
    public Account acc[];
    public int numOfAccounts = 0;

    public Bank(int s) {
        acc = new Account[s];
    }

    public void addAccount(Account account) {
        if (numOfAccounts < acc.length) {
            acc[numOfAccounts] = account;
            numOfAccounts++;
            System.out.println("adding done");
        } else
            System.out.println("sorry cant add any account ");


    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            double balance = account.getBalance_fields();
            System.out.println("Account balance: " + balance);
        } else {
            System.out.println("Account not found.");
        }
    }









    public void DisplayAll(){
        for (int i=0;i<numOfAccounts;i++)
        {
            acc[i].DisplayInfo();
            System.out.println("------------------------------------------------");
        }

    }
    public Account findAccount(String accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (acc[i].getAccount_number().equals(accountNumber)) {
                return acc[i];
            }
        }
        return null;
    }
}
