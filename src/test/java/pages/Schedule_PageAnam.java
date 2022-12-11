package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Schedule_PageAnam extends TopNavigationBar{

    @FindBy(xpath = "//td[@rowspan='4']")
    public WebElement reservedBlock;

    @FindBy(xpath = "(//p[@class='title is-size-4'])[1]")
    public WebElement roomName;

    @FindBy(xpath = "(//p[@class='title is-6'])[4]")
    public WebElement name;

    @FindBy(xpath = "//p[@class='title is-6']")
    public List<WebElement> scheduleInformation; //capacity,tv,whiteboard,date, time, reservator



}
