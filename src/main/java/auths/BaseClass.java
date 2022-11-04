package auths;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void ConfigureBS() {
		System.out.println("connect to database");
	}
	@BeforeTest
	public void ConfigureBT() {
	System.out.println("execute the script in parallel mode");
	}
	@BeforeClass
	public void ConfigureBC() {
		System.out.println("launching browser");
	}
	@BeforeMethod
	public void ConfigureBM() {
		System.out.println("login to the application");
	}
	@AfterMethod
	public void ConfigureAM() {
		System.out.println("logout from the application");
	}
	@AfterClass
	public void ConfigureAC() {
		System.out.println("close the browser");
	}
	@AfterTest
	public void ConfigureAT() {
		System.out.println("close parallel mode");
	}
	@AfterSuite
	public void ConfigureAS() {
		System.out.println("close the database connection");//these class extends in postoperationofbin in crudoperation src/test/java
	}
}
