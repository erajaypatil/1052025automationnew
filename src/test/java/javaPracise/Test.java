package javaPracise;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Test
{

	WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		//taking screenshot of page
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//takescreenshot syntax
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make();
		
		String timeBound=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		File dest=new File("C:\\Seleniun2025\\Screenshot\\"+ timeBound +"Screenshot.png");
		
		FileHandler.copy(src, dest);
		
		System.out.println("Test run successfully ");
		
		driver.close();
		
		
		
		
		
	}
}
