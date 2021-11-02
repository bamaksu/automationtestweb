package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class automationFlip {



        private static WebDriver driver;
        public static void main (String[]args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "E:\\selenium\\src\\test\\java\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://flip.id/");

        Thread.sleep(5000);
        WebElement linkbBantuan = driver.findElement(new By.ByLinkText("Bantuan"));
        linkbBantuan.click();
        System.out.println("Sukses ke link " +  driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Pusat Bantuan");

        Thread.sleep(5000);
        driver.navigate().to("https://flip.id/");

        Thread.sleep(5000);
        WebElement linkKarir = driver.findElement(new By.ByLinkText("Karir"));
        linkKarir.click();
        System.out.println("Sukses ke link " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(),"Flip Careers");

        Thread.sleep(5000);
        driver.navigate().to("https://flip.id/");

        Thread.sleep(5000);
        WebElement linkBiaya = driver.findElement(new By.ByLinkText("Biaya"));
        linkBiaya.click();
        System.out.println("Sukses ke link " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Pilihan Hemat Untuk Layanan Transfer Uang Antar Bank - Flip");

        Thread.sleep(5000);
        driver.navigate().to("https://flip.id/");

        Thread.sleep(5000);
        WebElement linkMasuk = driver.findElement(new By.ByLinkText("Masuk"));
        linkMasuk.click();
        System.out.println("Sukses masuk" + driver.getTitle());

        Thread.sleep(5000);
        driver.close();



        }
}
