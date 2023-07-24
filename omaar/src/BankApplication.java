import java.util.Scanner;
public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        /*
    Account acc=new Account(10,"OMar",5000);
    acc.withdraw(500);
    acc.deposit(200);
    Bank bank=new Bank(10) ;
    bank.addAccount(acc);




    System.out.println("/////////////////////////////////////////////////////////");
    ///////////////////////////////////////////////////////////////////


    SavingsAccount Savingacc= new SavingsAccount(11,"omarrrrr",1000,1.5) ;
    double inter=Savingacc.CalculateInterest();
    System.out.println("Calculated Interest is = "+ inter);

    System.out.println("/////////////////////////////////////////////////////////");
    //////////////////////////////////////////////////////////////////////


        bank.addAccount(Savingacc);

        bank.DisplayAll();
        bank.displayBalance(11);
        bank.withdraw(11,200);

*/
        Bank bank = new Bank(10);

        while (true) {


            System.out.println
                    ("1-Add New Account                     2-Deposit \n" +
                            "3-Withdraw                            4-Display balance  \n" +
                            "5-Calculate Interest                  6-Exit\n");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();

                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter interest rate : ");
                    double interestRate = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolderName,
                            initialBalance, interestRate);
                    bank.addAccount(savingsAccount);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = scanner.nextLine();

                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    bank.deposit(depositAccountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String withdrawAccountNumber = scanner.nextLine();

                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    bank.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String balanceAccountNumber = scanner.nextLine();
                    bank.displayBalance(balanceAccountNumber);

                    break;
                case 5:
                    System.out.print("Enter account number: ");
                     accountNumber = scanner.nextLine();
                    Account account = bank.findAccount(accountNumber);

                    if (account instanceof SavingsAccount) {
                         savingsAccount = (SavingsAccount) account;
                        double interest = savingsAccount.CalculateInterest();
                        System.out.println("Interest calculated Is " + accountNumber + ": " + interest);
                    } else {
                        System.out.println("Account not found .");
                    }
                    break;

                case 6:
                    System.out.println("Thanks for using the Bank Application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Entry.");
                    break;
            }
        }
}
}
