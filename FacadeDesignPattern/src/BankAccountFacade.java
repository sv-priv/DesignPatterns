public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode){
        this.accountNumber =accountNumber;
        this.securityCode = securityCode;

        welcomeToBank = new WelcomeToBank();
        accountNumberCheck= new AccountNumberCheck();
        securityCodeCheck =  new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public void makeDeposit(double toDeposit){

        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.securityCodeCorrect(securityCode)){
            System.out.println("Credentials are corrsect");
            System.out.println("Processing transaction");
            fundsCheck.makeDeposit(toDeposit);
            System.out.println("You made a deposit of: " + toDeposit);
            System.out.println("Your current balance is: " + fundsCheck.getCashInAccount());
        }else{
            System.out.println("Wrong credentials");
            System.out.println("Cannot make transaction");
        }
    }
    public void withdrawMoney(double toWithdraw){

        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.securityCodeCorrect(securityCode) && fundsCheck.hasEnoughMoney(toWithdraw)){
            System.out.println("Credentials are corrsect");
            System.out.println("Processing transaction");
            fundsCheck.makeWithdrawal(toWithdraw);
            System.out.println("You made a withdrawal of: " + toWithdraw);
            System.out.println("Your current balance is: " + fundsCheck.getCashInAccount());
        }else{
            System.out.println("Wrong credentials or not enough funds");
            System.out.println("Cannot make withdrawal");
        }
    }
}
