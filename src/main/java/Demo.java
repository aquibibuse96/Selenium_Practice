import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

    public static void main(String[] args){
       // System.out.println("Hello World");

        System.setProperty("webdriver.chrome.driver","C:\\Ascend\\Ascend Automation\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Ascend\\Ascend Automation\\geckodriver-v0.29.1-win64\\geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.get("http://Google.com");
        System.out.println("Title: " + driver.getTitle());
        //driver.close();
    }
}
