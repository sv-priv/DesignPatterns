public class SecurityCodeCheck {

    private int securityCode = 123;

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean securityCodeCorrect(int toCheck){
        if(securityCode == toCheck)
        {
            return true;
        }else {
            return false;
        }
    }
}
