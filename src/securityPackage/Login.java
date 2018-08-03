package securityPackage;

public class Login {
    private String user = "admin";
    private String password = "123456";

    public boolean compareUser(String user){
        if (this.user.compareTo(user) == 0){
            return true;
        }
        return false;
    }

    public  boolean comparePassword(String password){
        if (this.password.compareTo(password) == 0){
            return true;
        }
        return false;
    }
}
