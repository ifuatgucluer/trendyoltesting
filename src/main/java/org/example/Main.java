package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }


    WebDriver driver = Driver.getDriver();

    @Test
    public void test() throws InterruptedException {

        driver.get("https://trendyol.com/");

        WebElement homepage = driver.findElement(By.xpath("//div[@class='wrapper'][1]"));
        Assert.assertTrue("Homepage is visible", homepage.isDisplayed());
    }
}
