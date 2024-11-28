package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/r.php?locale=en_GB"); //to locate the url in the browser
driver.findElement(By.name("firstname")).sendKeys("Saint");  //to add first name 
driver.findElement(By.name("lastname")).sendKeys("Monica");   //to add surname

Select day= new Select(driver.findElement(By.name("birthday_day")));
Select month= new Select(driver.findElement(By.name("birthday_month")));
Select year= new Select(driver.findElement(By.name("birthday_year")));

day.selectByIndex(13);
month.selectByValue("8");
year.selectByVisibleText("1991");

driver.findElement(By.xpath("//*[@id=\"sex\"]")).click();
driver.findElement(By.name("reg_email__")).sendKeys("9496690368");
driver.findElement(By.name("reg_passwd__")).sendKeys("adbcf123");
driver.findElement(By.name("websubmit")).click();


		





	}

}
