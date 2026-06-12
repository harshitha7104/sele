package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        
        // 1. FORCE Selenium to use the system installation path
        options.setBinary("/usr/bin/google-chrome");
        
        // 2. Keep the critical sandbox/headless flags
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        
        WebDriver driver = new ChromeDriver(options);
        
        // Your automation logic
        driver.get("https://www.google.com");
        System.out.println("Success! Title is: " + driver.getTitle());
        
        driver.quit();
    }
}
