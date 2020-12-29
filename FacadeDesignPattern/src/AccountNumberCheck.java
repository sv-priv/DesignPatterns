public class AccountNumberCheck {

    private int accountNumber= 123;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public boolean accountActive(int toCheck){
        if(accountNumber == toCheck)
        {
            return true;
        }else {
            return false;
        }
    }
}
