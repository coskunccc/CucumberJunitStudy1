package com.cydeo.utilities;

import com.cydeo.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {
    }

    //private static WebDriver driver;
    private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                default:
                    throw new IllegalStateException("Unexpected browser :" + browser);
            }
        }
        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driverPool.get().manage().window().maximize();
        return driverPool.get();
    }
    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit(); //terminates the existing session
            driverPool.remove();
            //driverPool.set(null);
        }
    }
}
