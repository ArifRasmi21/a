package Arifrasmi;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;



public class mvnOne {
	
	@Test
	public void mavTwo(){
		
		System.setProperty("phantomjs.binary.path","/Users/arifrasmi/Desktop/Work/phantomjs-2.1.1-macosx/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://google.com");
		System.out.println("hello");

}
}