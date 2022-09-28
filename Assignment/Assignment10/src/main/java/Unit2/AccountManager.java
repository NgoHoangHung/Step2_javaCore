package Unit2;

import java.util.ArrayList;
import java.util.HashMap;
public class AccountManager {
 ArrayList<Account> accountObj;
    public AccountManager() {
        accountObj =  new ArrayList<>(100);
    }
    public void  creat(Account account) {
        accountObj.add(account);
    }
    public  boolean checkAccount(Account account) {
        for (int i = 0; i < accountObj.size(); i++) {
             if(accountObj.get(i).getId().equalsIgnoreCase(account.getId())&&
                     accountObj.get(i).getPassword().equalsIgnoreCase(account.getPassword()))
                 return true;
        }
        return false;
    }


}
