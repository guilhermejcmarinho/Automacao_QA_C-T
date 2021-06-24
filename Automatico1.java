package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatico1 {
    @Test
    public void abrirNavegador(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opentdb.com/");

        WebElement botao = driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]"));
        botao.click();

        WebElement caixaText = driver.findElement(By.xpath("//*[@id=\"query\"]"));
        caixaText.sendKeys("Science: Computers");

        WebElement botaoSearch = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        botaoSearch.click();

    }
}
