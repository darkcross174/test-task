import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.*;

public class Main {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lexa\\IdeaProjects\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.ru/");
        driver.findElement(cssSelector("[data-testid='login-input']")).sendKeys("andreev_aa.89");
        driver.findElement(className("domain-select")).click();
        Select dropdown = new Select(driver.findElement(cssSelector("[name='domain']")));
        dropdown.selectByVisibleText("@bk.ru");
        driver.findElement(cssSelector("[data-testid='enter-password']")).click();
        //driver.findElement(cssSelector("[data-testid='password-input']")).sendKeys("Darkcross8520");
        driver.findElement(cssSelector("[data-testid='enter-password']")).click();
        driver.findElement(cssSelector("[title='написать письмо']")).click();
        driver.findElement(new ByClassName("editable-container-pgoo")).sendKeys("hallo, world!");
        driver.findElement(className("button2_txt")).click();

    }
}
