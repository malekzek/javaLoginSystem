
package loginsystem1;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("ahmad","gaming");
		logininfo.put("mhmd","PASSWORD");
		logininfo.put("ali","anime");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
    
}
}