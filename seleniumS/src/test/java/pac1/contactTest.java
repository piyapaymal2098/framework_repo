package pac1;

import org.testng.annotations.Test;

public class contactTest {
@Test
public void creatcontactTest() {
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
public void modifyconntactTest() {
System.out.println("execute modifyconntactTest");
}
@Test
public void deleteconntactTest() {
System.out.println("execute modifyconntactTest");
//
}
}
