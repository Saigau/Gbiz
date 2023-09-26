package Test;

import org.testng.annotations.Test;



import Utility.proper;



public class Test_login extends BaseFile {
	
	@Test(priority = 0)
	public void Cred() throws Throwable
	{
		login.credentialsuser(proper.prop("user"));
		login.credentialspass(proper.prop("pass"));
		login.SwitchGbiz();
	}

}
