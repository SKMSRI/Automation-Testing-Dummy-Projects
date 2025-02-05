package com.automationdummyprojects.Dummy_projects_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Dummy_2_CuraHealthApp {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver =new EdgeDriver();
        driver.get(" https://katalon-demo-cura.herokuapp.com");
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(5000);

        //Login
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        System.out.println(driver.getCurrentUrl());
        //Action events





    }
}
