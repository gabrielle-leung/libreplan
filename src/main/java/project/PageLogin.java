package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends Page{

    @FindBy(xpath="//input[@name='j_username']")
    private WebElement f_username;
    
    private void setChampsUser(String name){
        f_username.clear();
        f_username.sendKeys(name);
    }
    
    @FindBy(xpath="//input[@name='j_username']")
    private WebElement f_password;
    
    private void setChampsPasswd(String passwd){
        f_password.clear();
        f_password.sendKeys(passwd);
    }

    @FindBy(xpath = "//input[@id='button']")
    private WebElement b_seConnecter;

    public PageAccueil seConnecter(WebDriver driver,String log, String mdp){
        setChampsUser(log);
        setChampsPasswd(mdp);
        b_seConnecter.click();
        return PageFactory.initElements(driver, PageAccueil.class);
    }


}
