package LoginPage;

import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<>();
	
	public IDandPassword()
	{
		logininfo.put("sifi", "tarek mazigh");
		logininfo.put("kecira", "abderraouf");
		logininfo.put("ghaoui", "wail");
	}

	public HashMap<String, String> getLogininfo() 
	{
		return logininfo;
	}
	
	
}
