import package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        
        // Critical flags for CI/CD environments like Jenkins:
        options.addArguments("--headless=new");          // Run without a GUI
        options.addArguments("--no-sandbox");             // Bypass OS security model (Required for Jenkins/Root)
        options.addArguments("--disable-dev-shm-usage");  // Overcome limited resource problems in VMs
        options.addArguments("--disable-gpu");            // Disables GPU hardware acceleration
        
        WebDriver driver = new ChromeDriver(options);
        
        // Your automation code...
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.quit();
    }
}
