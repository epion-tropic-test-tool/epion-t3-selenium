package com.epion_t3.selenium.runner;

import com.epion_t3.core.command.bean.CommandResult;
import com.epion_t3.core.message.MessageManager;
import com.epion_t3.selenium.command.WDSelectVisibleTextElement;
import com.epion_t3.selenium.message.SeleniumMessages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;

public class WDSelectVisibleTextElementRunner extends AbstractWDCommandRunner<WDSelectVisibleTextElement> {
    @Override
    public CommandResult execute(
            final WDSelectVisibleTextElement command,
            final Logger logger) throws Exception {

        // WebDriverを取得
        WebDriver driver = getWebDriver(command);

        // 対象のWebElementを取得
        WebElement element = findWebElement(driver, command);

        Select select = new Select(element);

        if (!element.isDisplayed()) {
            logger.warn(MessageManager.getInstance().getMessage(SeleniumMessages.SELENIUM_WRN_2001));
        }
        select.selectByVisibleText(command.getValue());

        return CommandResult.getSuccess();
    }
}
