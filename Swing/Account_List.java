
package Swing;

import java.util.ArrayList;

public class Account_List {
 String UserName;
 String password;

    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return password;
    }
    public Account_List(String UserName, String password) {
        this.UserName = UserName;
        this.password = password;
    }
    static ArrayList<Account_List> list = new ArrayList<>();
 
    
    
}
