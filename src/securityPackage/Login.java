package securityPackage;

import controller.Input;
import view.GeneralDefaultMessages;
import view.LoginDefaultMessages;

public class Login {

    public Login(){
        LoginDefaultMessages display = new LoginDefaultMessages();
        display.enterLoginMessage();
        Input newInput = new Input();
        User user = new User();
        Password password = new Password();


        String login = newInput.simpleString();
        while (!user.userValidation(login)){
            display.wrongLoginMessage();
            display.enterLoginMessage();
            login = newInput.simpleString();
        }
        display.enterPasswordMessage();
        login = newInput.simpleString();

        while (!password.passwordValidation(login)){
            display.wrongPasswordMessage();
            display.enterPasswordMessage();
            login = newInput.simpleString();
        }

        GeneralDefaultMessages.welcome();
    }
}
