package com.epion_t3.selenium.runner;

import com.epion_t3.core.command.bean.CommandResult;
import com.epion_t3.core.message.MessageManager;
import com.epion_t3.selenium.command.WDClearSendKeysElements;
import com.epion_t3.selenium.message.SeleniumMessages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import java.util.List;

public class WDClearSendKeysElementsRunner extends AbstractWDCommandRunner<WDClearSendKeysElements> {
    @Override
    public CommandResult execute(WDClearSendKeysElements command, Logger logger) throws Exception {

        // WebDriverを取得
        WebDriver driver = getWebDriver(command);

        // 対象のWebElementsを取得
        List<WebElement> elements = findWebElements(driver, command);

        int targetIndex = command.getElementIndex() == null ? 0 : command.getElementIndex();

        WebElement element = elements.get(targetIndex);

        if (!element.isDisplayed()) {
            logger.warn(MessageManager.getInstance().getMessage(SeleniumMessages.SELENIUM_WRN_2001));
        }

        element.clear();
        element.sendKeys(command.getValue());

        return CommandResult.getSuccess();
    }
}
