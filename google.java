package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class google{
    @Test
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hackerrank.com/auth/login/decisions");
        driver. findElement(By.id("input-1")).sendKeys("2000030378@kluniversity.in");
        driver.findElement(By.id("input-2")).sendKeys("king128kong");
        //driver.findElement(By.className("login-logo"));
        driver.findElement(By.linkText("Lost password?")).sendKeys("text-link forgot-password-link");


    }
}