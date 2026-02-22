package utils;

public class Base extends BrowserFactory {
    public Base(){
        super();
        startBrowser("chrome", "https://businesslendingqa.vodacom.co.za/registration");
    }
}
