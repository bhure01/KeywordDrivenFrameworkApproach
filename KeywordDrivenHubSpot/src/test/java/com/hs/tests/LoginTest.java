package com.hs.tests;

import com.hs.keyword.engine.KeyWordEngine;
import org.testng.annotations.Test;

public class LoginTest {

    public KeyWordEngine keyWordEngine;

    @Test
    public void loginTest(){
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("login");
    }

    @Test
    public void signUpTest(){
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("signup");
    }

}
