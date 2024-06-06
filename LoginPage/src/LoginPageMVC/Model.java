package LoginPageMVC;

import java.util.HashMap;

public class Model {
	HashMap<String,String> logininfo = new HashMap<>();
	
	public Model()
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
