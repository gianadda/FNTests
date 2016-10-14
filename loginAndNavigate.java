import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class loginAndNavigate {
    public static void main(String[] args) throws Exception {
        FirefoxDriver wd;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://app.fieldnimble.com/");
        wd.findElement(By.id("input_0")).click();
        wd.findElement(By.id("input_0")).clear();
        wd.findElement(By.id("input_0")).sendKeys("gianadda@fieldnimble.com");
        wd.findElement(By.id("input_1")).click();
        wd.findElement(By.id("input_1")).clear();
        wd.findElement(By.id("input_1")).sendKeys("fieldnimbledemo");
        wd.findElement(By.cssSelector("button.pull-right.ng-binding")).click();
        wd.findElement(By.id("navigation-organization-name")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[4]/div[2]/div[1]")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[5]/div[2]/div[1]")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[6]/div[2]/div[1]")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[7]/div[2]/div[1]")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[8]/div[2]/div[1]")).click();
        wd.findElement(By.xpath("//div/home/div/navigation/div/ul/li[9]/div[2]/div[1]")).click();
        if (!wd.findElement(By.tagName("html")).getText().contains("Maintenance")) {
            System.out.println("verifyTextPresent failed");
        }
        wd.findElement(By.id("page-header-alternative")).click();
        new Actions(wd).doubleClick(wd.findElement(By.id("page-header-alternative"))).build().perform();
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
