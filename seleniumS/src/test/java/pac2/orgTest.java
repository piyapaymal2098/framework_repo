package pac2;

import org.testng.annotations.Test;

public class orgTest {
@Test
public void creatorgTest() {
System.out.println("execute creatorgTest");
String URL = System.getProperty("url");
String BROWSER = System.getProperty("browser");
String USERNAME = System.getProperty("username");
String PASSWORD = System.getProperty("password");
System.out.println("execute creatcontactTest");
System.out.println(URL);
System.out.println(BROWSER);
System.out.println(USERNAME);
System.out.println(PASSWORD);


}
@Test
public void modifyorgTest() {
System.out.println("execute modifyorgTest");
}
//
}
