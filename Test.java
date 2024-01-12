package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

public static void main(String[] args) {
System.setProperty("webdriver.Chrome.driver",
"C:\\Users\\CDAC\\Desktop\\Selenium Testing\\chromedriver-win32\\chromedriver.exe");

WebDriver d1 = new ChromeDriver();
d1.get("https://demo.guru99.com/test/newtours/");
System.out.println(d1.getCurrentUrl());

d1.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("pushpak");

d1.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Pushpak6300");

d1.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("8380836300");

d1.findElement(By.xpath("//input[@id='userName']")).sendKeys("9845646854");

d1.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("Kolhapur");

d1.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Kolhapur");

d1.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("XYA");

d1.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("416209");

d1.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");

d1.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("Pushpak1020");

d1.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("Pushpak1020");

d1.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();

d1.navigate().to("https://demo.guru99.com/test/newtours/login.php");
WebElement w = d1.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
w.sendKeys("Addmin");

System.out.println(w.getAttribute("value"));
WebElement w1 = d1.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
w1.sendKeys("Admin");

System.out.println(w.getAttribute("value"));
WebElement submit = d1.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
submit.click();

}
}