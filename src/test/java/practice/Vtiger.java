package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vtiger {
	@Test
	public void Organization() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		Reporter.log("Opened the Vtiger login page");

		// Find the user name and password input fields and enter the values
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		Reporter.log("Entered Username and password credentials");

		// submit the Login form
		driver.findElement(By.id("submitButton")).click();
		Reporter.log("Clicked on the login buttons");

		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		Reporter.log("Click On the Organization Module", true);
		Thread.sleep(2000);
		// Click on the Organization Lookup button
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Reporter.log("Click on the Organization LookUp button", true);
		Thread.sleep(2000);
		// Enter the value of the OrganizationName TextField
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Virtusa");
		Reporter.log("Enter the value of the OrganizationName is Virtusa", true);
		Thread.sleep(2000);
		// Enter the value of the Website TextField
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("https//www.Google.com");
		Reporter.log("Enter the value of the Website is Google.com", true);
		Thread.sleep(2000);
		// Handle the MemberOf TextField selectlookup button
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Thread.sleep(2000);
		// Handle the child Window
		String ParentWindowHandle = driver.getWindowHandle();
		Reporter.log("Parent Window Handle ID - " + ParentWindowHandle + ", Title: " + driver.getTitle());

//		MultipleWindowHandles mwh = new MultipleWindowHandles();
//		mwh.WithAlert(driver, ParentWindowHandle);
//
//		driver.switchTo().window(ParentWindowHandle);
//		driver.findElement(By.xpath("//input[@title='Clear']")).click();
//		driver.findElement(By.xpath("//img[@title='Select']")).click();
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String windowHandle : windowHandles) {
//			if (!windowHandle.equals(ParentWindowHandle)) {
//				driver.switchTo().window(windowHandle);
//				driver.manage().window().maximize();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//a[@id='4']")).click();
//				Thread.sleep(2000);
//				System.out.println("Opened the Alert Page");
//				Alert Al = driver.switchTo().alert();
//				Thread.sleep(3000);
//				System.out.println(Al.getText());
//				Thread.sleep(2000);
//				Al.accept();
//			}
//		}
		driver.switchTo().window(ParentWindowHandle);
		// Enter the value of the Employee TextField
		driver.findElement(By.xpath("//input[@id='employees']")).sendKeys("20000");
		Reporter.log("Enter the value of the Employees is 20000", true);
		Thread.sleep(2000);
		// Enter the value of the Other Email
		driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("John23@gmail.com");
		Reporter.log("Enter the value of the other Email is John23@gmail.com", true);
		// Handling the Industry DropDownList
		WebElement IndustryAddrs = driver.findElement(By.xpath("//select[@name='industry']"));
		Select sel = new Select(IndustryAddrs);
		sel.selectByValue("Education");
		Reporter.log("Handling the Industry dropdown list and select the option is Education", true);
		Thread.sleep(2000);
		// Handling the Type DropDownList
		WebElement TypeAddrs = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select sel1 = new Select(TypeAddrs);
		sel1.selectByValue("Investor");
		Reporter.log("Handling the Type dropdown list and select the option is Investor", true);
		// Click the Email OptOut Checkbox
		driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
		Reporter.log("Select the EmailOptout checkbox", true);
		// Handling the AssignedTo Group RadioButton and DropdownList
		driver.findElement(By.xpath("//input[@value='T']")).click();
		Reporter.log("Select the Group radio button", true);
		WebElement AssignedToAddrs = driver.findElement(By.xpath("//select[@name='assigned_group_id']"));
		Select sel2 = new Select(AssignedToAddrs);
		sel2.selectByVisibleText("Support Group");
		Reporter.log("Handlin the AssignedTo dropdown list and select the option is Support Group ", true);
		// Enter the value of the Phone TextField
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("786543210");
		Reporter.log("Enter the value of the Phone is 786543210", true);
		// Enter the value of the Fax TextField
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("DTDC");
		Reporter.log("Enter the value of the Fax is DTDC", true);
		// Enter the value of the OtherPhone TextField
		driver.findElement(By.xpath("//input[@id='otherphone']")).sendKeys("786543223");
		Reporter.log("Enter the value of the Phone is 786543223", true);
		// Enter the value of the Email TextField
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("pop23@gmail.com");
		Reporter.log("Enter the value of the  Email is pop23@gmail.com", true);
		// Enter the value of the OwnerShip TextField
		driver.findElement(By.xpath("//input[@id='ownership']")).sendKeys("Google");
		Reporter.log("Enter the value of the OwnerShip is Google", true);
		// Handling the Rating DropDownList
		WebElement Ratingaddrs = driver.findElement(By.xpath("//select[@name='rating']"));
		Select sel3 = new Select(Ratingaddrs);
		sel3.selectByValue("Acquired");
		Reporter.log("Handling the Rating dropdown list and select the option is Acquired", true);
		Thread.sleep(2000);
		// Enter the value of the SIC Code TextField
		driver.findElement(By.xpath("//input[@id='siccode']")).sendKeys("543223");
		Reporter.log("Enter the value of the SIC Code is 543223", true);
		// Enter the value of the AnnualRevenue TextField
		driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("500");
		Reporter.log("Enter the value of the AnnualRevenue is 500", true);
		Thread.sleep(2000);
		// Click the Notify Owner Checkbox
		driver.findElement(By.xpath("//input[@name='notify_owner']")).click();
		Reporter.log("Select the Notify Owner checkbox", true);
		// Address Information
		// Enter the value of the Billing Address TextField
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Koramangala Bangalore 560086");
		Reporter.log("Enter the value is Koramangala Bangalore 560086", true);
		Thread.sleep(2000);
		// Enter the value of the BillingPO Box TextField
		driver.findElement(By.xpath("//input[@id='bill_pobox']")).sendKeys("Postal");
		Reporter.log("Enter the value is Postal", true);
		Thread.sleep(2000);
		// Enter the value of the BillingCity TextField
		driver.findElement(By.xpath("//input[@id='bill_city']")).sendKeys("Bangalore");
		Reporter.log("Enter the value is Bangalore", true);
		Thread.sleep(2000);
		// Enter the value of the BillingState TextField
		driver.findElement(By.xpath("//input[@id='bill_state']")).sendKeys("Karnataka");
		Reporter.log("Enter the value is Karnataka", true);
		Thread.sleep(2000);
		// Enter the value of the Billing Postal Code TextField
		driver.findElement(By.xpath("//input[@id='bill_code']")).sendKeys("560223");
		Reporter.log("Enter the value of the BillingPostal Code is 560223", true);
		// Enter the value of the BillingCountry TextField
		driver.findElement(By.xpath("//input[@id='bill_country']")).sendKeys("India");
		Reporter.log("Enter the value is India");
		Thread.sleep(2000);
		// Enter the value of the Shipping Address TextField
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Hyderabad Kukatpally 546005");
		Reporter.log("Enter the value is Hyderabad Kukatpally 546005");
		Thread.sleep(2000);
		// Enter the value of the Shipping PO Box TextField
		driver.findElement(By.xpath("//input[@id='ship_pobox']")).sendKeys("Postal");
		Reporter.log("Enter the value is Postal");
		Thread.sleep(2000);
		// Enter the value of the Shipping City TextField
		driver.findElement(By.xpath("//input[@id='ship_city']")).sendKeys("Hyderabad");
		Reporter.log("Enter the value is Hyderabad");
		Thread.sleep(2000);
		// Enter the value of the Shipping State TextField
		driver.findElement(By.xpath("//input[@id='ship_state']")).sendKeys("Telangana");
		Reporter.log("Enter the value is Telangana");
		Thread.sleep(2000);
		// Enter the value of the Shipping Postal Code TextField
		driver.findElement(By.xpath("//input[@id='ship_code']")).sendKeys("570253");
		Reporter.log("Enter the value of the Ship Code is 570253");
		// Enter the value of the Shipping Country TextField
		driver.findElement(By.xpath("//input[@id='ship_country']")).sendKeys("India");
		Reporter.log("Enter the value is India");
		Thread.sleep(2000);
		// Description Information
		// Enter the value of the Descriptions TextField
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Hello Goggle");
		Reporter.log("Enter the value is Hi Team");
		Thread.sleep(2000);
		// Click the Save Button
		driver.findElement(By.xpath("//input[contains(@class,'crmbutton small save')]")).click();
		Reporter.log("Click the Save button");
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void Contact() {
		
	}

}
