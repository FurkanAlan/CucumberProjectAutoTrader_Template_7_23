package com.autotrader.utilities;

import com.autotrader.pages.AdvanceSearchPage;
import com.autotrader.pages.AutoTraderPage;

public class PageInitializer extends MyDriver{
    public static AdvanceSearchPage advanceSearchPage;
    public static AutoTraderPage autoTraderPage;

    public static void initializeAllPages() {

        advanceSearchPage = new AdvanceSearchPage();
        autoTraderPage = new AutoTraderPage();
    }
}
