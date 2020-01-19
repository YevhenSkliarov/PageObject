package com.it.tests;

import com.it.App;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {
    static protected App app = new App();

    @AfterSuite
    public void tearDownSuite() {
        app.common.stopApp();
    }
}
