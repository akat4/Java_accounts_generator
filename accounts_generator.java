import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Random;

public class FakeEmailGenerator {
    private static final String[] DOMAINS = {
        "gmail.com",
        "yahoo.com",
        "hotmail.com",
        "outlook.com",
        "icloud.com"
    };

    public static String generate() throws AddressException {
        Random random = new Random();
        String username = "user" + random.nextInt(1000);
        String domain = DOMAINS[random.nextInt(DOMAINS.length)];
        String email = username + "@" + domain;
        InternetAddress internetAddress = new InternetAddress(email);
        internetAddress.validate();
        return email;
    }
}
//install pkg 
String fakeEmail = FakeEmailGenerator.generate();
System.out.println(fakeEmail);