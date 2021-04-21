import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChallengeFour {
    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void signUpTest() throws InterruptedException{
        driver.get("https://sanusart.github.io/react-dropdown-select/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div/div/div[3]/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/span[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[2]/div[2]/div/div/div/div/div/div[1]/span[1]/span[2]")).click();
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }
    }