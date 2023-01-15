package zad5;

import java.net.URL;
import java.util.List;

public class Phone {

    private static final String DEFAULT_SERVER_ADDRESS = "https://kacper.appserver";
    private static final String DEFAULT_APP_VERSION = "latest_stable";
    void installAnApp(URL appName)
    {
       this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    void installAnApp(String appName, String version)
    {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }
    void installAnApp(String appName, String version, String server)
    {
        System.out.println("instaluję aplikację"+appName);
        System.out.println("wwersji"+version);
        System.out.println("z serwera"+server);
        System.out.println("sprawdzam płatność");
        System.out.println("sprawdzam miejsce");
        System.out.println("instaluje");
    }
   void installAnApp(List<String> appNames)
   {
        for (String appName : appNames)
        {
           this.installAnApp(appName);
        }
   }
}
