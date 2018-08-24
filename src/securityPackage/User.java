package securityPackage;

public class User {
    private String adminUser = "admin";

    protected boolean userValidation(String user){
        if (adminUser.compareTo(user) == 0){
            return true;
        }
        return false;
    }
}
