package casestudy.casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver;

	@Given("^user open TestMeApp$")
	public void userOpenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

	@When("^user click signup$")
	public void userClickSignup() {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@When("^user click signin$")
	public void userClickSignin() {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}

	@And("^user enter credentials as$")
	public void enterCredentials(DataTable dt) {
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}

	@And("^enter user name as \"([^\"]*)\"$")
	public void enterusername(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}

	@And("^enter first name as \"([^\"]*)\"$")
	public void enterfirstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	}

	@And("^enter last name as \"([^\"]*)\"$")
	public void enterlastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@And("^enter password as \"([^\"]*)\"$")
	public void enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("^enter confirm password as \"([^\"]*)\"$")
	public void enterconfrmpassword(String confirmpassword) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(confirmpassword);
	}

	@And("^user select gender as \"([^\"]*)\"$")
	public void userselectGender(String Gender) {
		List<WebElement> allradiobuttons = driver.findElements(By.id("gender"));
		allradiobuttons.get(1).click();
	}

	@And("^enter email as \"([^\"]*)\"$")
	public void enteremail(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@And("^enter mobile number as \"([^\"]*)\"$")
	public void entermobileNumber(String mobilenumber) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mobilenumber);
	}

	@And("^enter DOB as \"([^\"]*)\"$")
	public void DOB(String DOB) {
		driver.findElement(By.id("dob")).sendKeys(DOB);
	}

	@And("^enter address as \"([^\"]*)\"$")
	public void address(String address) {
		driver.findElement(By.id("address")).sendKeys(address);
	}

	@And("^select security question as \"([^\"]*)\"$")
	public void question(String securityQuestion) {
		WebElement dropdown = driver.findElement(By.name("securityQuestion"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
	}

	@And("^enter answer is \"([^\"]*)\"$")
	public void answer(String answer) {
		driver.findElement(By.id("answer")).sendKeys(answer);
	}

	@Then("^user click Register$")
	public void userClickRegister() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
}
