package com.epion_t3.selenium.runner;

import com.epion_t3.core.command.bean.CommandResult;
import com.epion_t3.core.command.runner.impl.AbstractCommandRunner;
import com.epion_t3.core.exception.SystemException;
import com.epion_t3.selenium.command.WDGetHtmlSource;
import com.epion_t3.selenium.message.SeleniumMessages;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 */
public class WDGetHtmlSourceRunner extends AbstractCommandRunner<WDGetHtmlSource> {
    @Override
    public CommandResult execute(
            WDGetHtmlSource command,
            Logger logger) throws Exception {
        // WebDriverを取得
        WebDriver driver = resolveVariables(command.getRefWebDriver());
        // WebDriverが解決できない場合はエラー
        if (driver == null) {
            throw new SystemException(SeleniumMessages.SELENIUM_ERR_9007, command.getRefWebDriver());
        }

        // HTMLソースを取得
        String source = driver.getPageSource();

        Path evidence = getEvidencePath("PageSource.html");

        // HTMLソースファイルを書き出す
        Files.writeString(evidence,source);

        // エビデンスを登録
        registrationFileEvidence(evidence);
        registrationObjectEvidence(source);
        return CommandResult.getSuccess();
    }
}
