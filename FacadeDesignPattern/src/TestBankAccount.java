public class TestBankAccount {


    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(123,123);
        accessingBank.makeDeposit(500.00);
        System.out.println(accessingBank.fundsCheck.getCashInAccount());
        accessingBank.makeDeposit(1000.00);
        System.out.println(accessingBank.fundsCheck.getCashInAccount());
        accessingBank.withdrawMoney(500.00);
        System.out.println(accessingBank.fundsCheck.getCashInAccount());
        accessingBank.withdrawMoney(50000.00);

    }


}
