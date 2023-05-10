package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopCommercePage extends Utils {
    private By _title=By.id("AddNewComment_CommentTitle");
    private By _comment=By.id("AddNewComment_CommentText");
    private By _newComment =By.name("add-comment");
    private By _result=By.className("result");
    public void newReleaseComments(){
        typeTextFromElement(_title,"hello");
        typeTextFromElement(_comment,"This website is very good");
        clickOnElement(_newComment);
        Assert.assertEquals(getTextFromElement(_result),"News comment is successfully added.");
    }
}
