package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends Page{

    @FindBy(xpath="//input[@name='j_username']")
    private WebElement c_nomUtilisateur;
    
    private void setChampsUser(String nom){
        c_nomUtilisateur.clear();
        c_nomUtilisateur.sendKeys(nom);
    }
    
    @FindBy(xpath="//input[@name='j_username']")
    private WebElement c_mdp;
    
    private void setChampsPasswd(String mdp){
        c_mdp.clear();
        c_mdp.sendKeys(mdp);
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
