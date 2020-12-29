public class FundsCheck {

    private double cashInAccount= 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void setCashInAccount(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public void deposit(double cashAdded){

        cashInAccount+=cashAdded;
    }


    public void withdraw(double cashWithdrawed){
        cashInAccount-=cashWithdrawed;

    }
    public boolean hasEnoughMoney(double cashToWithdraw){
            if(cashToWithdraw<=getCashInAccount()){
                return  true;
            }else {
                return false;
            }
    }

    public void makeWithdrawal(double cashToWithdraw){
        if (cashToWithdraw > getCashInAccount()){
            System.out.println("U don't have enough money");
            System.out.println("Ur current balance is "  +getCashInAccount() );
        }else{
            withdraw(cashToWithdraw);
            System.out.println("Withdraw complete..");
            System.out.println("Ur current balance is "  +getCashInAccount() );

        }
    }
    public void makeDeposit(double cashToAdd){

        deposit(cashToAdd);
        System.out.println("Deposit complete..");
        System.out.println("Ur current balance is "  +getCashInAccount() );


    }


}
