package restassured;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.config.SessionConfig;
import io.restassured.filter.session.SessionFilter;
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
		when()
			.get("https://news.baidu.com/")
		.then().statusCode(200);
	}
	
	@Test
	public void baidu(){
		System.out.print("aaaaaaaaaaaa");		
	}

}
