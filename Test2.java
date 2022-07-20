package TEST1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	

	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\EcLIPS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		for(;;) 
			
			
		{
					
					
					
		WebElement user=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		user.sendKeys("standard_user");
		
		Thread.sleep(500);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		}
		/*
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		menu.click();
		
		Thread.sleep(500);
		
		WebElement item=driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
		item.click();
		
		WebElement item_name=driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		item_name.click();
		
		Thread.sleep(1000);
		
		WebElement add_to_cart=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		add_to_cart.click();
		
		WebElement cart_badge=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		cart_badge.click();
		
		Thread.sleep(1000);
		
		WebElement continue_shopping=driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
		continue_shopping.click();
		
		Thread.sleep(1000);
	
		WebElement item2=driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
		item2.click();
		
		Thread.sleep(1000);
		
		WebElement add_to_cart1=driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
		add_to_cart1.click();
	
		Thread.sleep(1000);
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();
		
		WebElement checkout=driver.findElement(By.name("checkout"));
		checkout.click();
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		name.sendKeys("gaurank");
		
		WebElement last=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		last.sendKeys("zerbade");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("453441");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
		
		
		
		driver.close();
		
		
		Thread.sleep(1000);
		
		//WebElement back_button=driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
		//back_button.click();
		
		Thread.sleep(1000);
		
		//WebElement select_product=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
		//select_product.click();
		
		Thread.sleep(1000);
		
		//WebElement xyza=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
		//xyza.sendKeys(Keys.ARROW_DOWN);
		//xyza.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);

		//WebElement xyzab=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
		//xyzab.sendKeys(Keys.ENTER);
		
		//WebElement menu1=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		//menu1.click();
		
		
		Thread.sleep(1000);
		
		//WebElement about=driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
		//about.click();
		
		Thread.sleep(1000);
		
		//WebElement about1=driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[1]/div[1]/div/a"));
		//about1.click();
		
		Thread.sleep(1000);
		
		//WebElement about2=driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[2]/div[1]/div/a"));
		//about2.click();
		
		
		//WebElement popup=driver.findElement(By.xpath("//*[@id=\"popup-widget5132-close-icon\"]"));
		//popup.click();
		
		//WebElement Getin=driver.findElement(By.xpath("//*[@id=\"n-5043\"]/div/section/div[4]/div/div[1]/div/div[3]/a"));
		//Getin.click();	
		
	
		
		//WebElement findmycandy=driver.findElement(By.xpath("//*[@id=\"nav-5151\"]/li[3]/a"));
		//findmycandy.click();
		*/
		
		
}
}
