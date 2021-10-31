package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username){
        return !"".equals(username);
    }
    public boolean isValidPassword(String password1, String password2){
        return (password1.length() > 7) && password1.equals(password2);
    }
    public boolean isValidEmail(String email){
        return email.indexOf("@") > 0
                && email.indexOf("@")+ 1 < email.indexOf(".")
                && email.length() > email.indexOf(".") + 1;
    }}
