package com.epion_t3.selenium.message;

import com.epion_t3.core.message.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SeleniumMessages implements Messages {

    SELENIUM_ERR_9001("com.epion_t3.selenium.err.9001"),
    SELENIUM_ERR_9004("com.epion_t3.selenium.err.9004"),
    SELENIUM_ERR_9005("com.epion_t3.selenium.err.9005"),
    SELENIUM_ERR_9006("com.epion_t3.selenium.err.9006"),
    SELENIUM_ERR_9007("com.epion_t3.selenium.err.9007"),
    SELENIUM_ERR_9008("com.epion_t3.selenium.err.9008"),
    SELENIUM_ERR_9009("com.epion_t3.selenium.err.9009"),
    SELENIUM_ERR_9010("com.epion_t3.selenium.err.9010"),
    /* 警告 */
    SELENIUM_WRN_2001("com.epion_t3.selenium.wrn.2001");

    private String messageCode;

}
