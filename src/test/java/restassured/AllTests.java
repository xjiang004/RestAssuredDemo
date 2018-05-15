package restassured;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	RestAssuredDemo.class, 
	RestAssuredDemo2.class, 
	RestAssuredDemo3.class 
})
public class AllTests {

}
