package lhh.seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.setProperty("webdriver.ie.driver", "files/IEDriverServer.exe");
    	WebDriver driver = new InternetExplorerDriver();
    	String url = "http://www.baidu.com";
        driver.get(url); // 打开指定的网站

    	
        System.out.println( "Hello World!" );
    }
}
