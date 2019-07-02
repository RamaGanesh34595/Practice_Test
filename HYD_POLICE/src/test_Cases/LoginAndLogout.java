package test_Cases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import business_Library.KeywordActions;

public class LoginAndLogout extends KeywordActions{

	public LoginAndLogout() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void LoginMethod() throws Exception {		
		KeywordActions a = KeywordActions.getActionInstance();
		a.executeKeyword("LoginAndLogout");
	}
	
	@BeforeTest
	public void beforeTest() {
		test = extent.createTest("Hyderabad Police Login Module", "This is a validate statement");
	}
	
	@AfterTest
	public void afterTest() {
		extent.flush();
	}
}
