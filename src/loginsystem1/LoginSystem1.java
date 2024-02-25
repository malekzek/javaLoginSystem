
package loginsystem1;


public class LoginSystem1 {


    public static void main(String[] args) {
      
    IDandPasswords idandPasswords = new IDandPasswords();
				
    LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());


    }
    
}
