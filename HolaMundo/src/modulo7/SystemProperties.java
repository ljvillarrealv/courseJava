package modulo7;

import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);


        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String VersionJava = System.getProperty("java.version");
        System.out.println("VersionJava = " + VersionJava);

        Properties p = System.getProperties();
        System.out.println("p = " + p);

        p.list(System.out);
    }
}
