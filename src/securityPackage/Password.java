package securityPackage;

public class Password {
    private String adminPassword = "123456";

    protected boolean passwordValidation(String password){
        if (adminPassword.compareTo(password) == 0){
            return true;
        }
        return false;
    }
}
