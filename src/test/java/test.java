import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test {
    public static <CromeDriver> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\DriverForGame\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aac.ac.il/");
        driver.manage().window().maximize();

        List<WebElement> elementList = driver.findElements(By.linkText("מידע אישי"));
        WebElement personalButton = elementList.get(0);
        Thread.sleep(10500);
        personalButton.click();
        WebElement userNameInput = driver.findElement(By.id("Ecom_User_ID"));
        userNameInput.sendKeys("chagaichaimi");
        WebElement passwordNameInput = driver.findElement(By.id("Ecom_Password"));
        passwordNameInput.sendKeys("acef6803@");
        WebElement enter = driver.findElement(By.className("submit"));
        enter.click();

    }
}
