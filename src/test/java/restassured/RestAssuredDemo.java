package restassured;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class RestAssuredDemo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		given().param("", "").
		when()
			.get("https://news.baidu.com/")
		.then().statusCode(200);
	
//		System.out.print("aaaaaaaaaaaa");
//		assertTrue("a", true);
	}
	
	@Test
	public void baidu(){
		System.out.print("aaaaaaaaaaaa");		
	}

}
