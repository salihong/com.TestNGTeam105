package day14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.time.Duration;

public class C03_NutellaTesti {

    @Test
    public void test01(){
        Driver.getDriver().get("https://wwww.amazon.com");
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        AmazonPage amazonPage=new AmazonPage();
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement aramaSonucuElementi=Driver.getDriver().
                findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime="Nutella";
        String actualAramaSonucu=amazonPage.aramasonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
        Driver.closeDriver();

    }

}
