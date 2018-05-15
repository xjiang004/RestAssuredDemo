package restassured;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredDemo3 {
	
	
	@Test
	public void testGet(){
		when()
			.get("https://my.worktile.com").prettyPeek()
		.then()
			.statusCode(200)
			.body("html.head.title", equalTo("Worktile 让工作更简单 - Worktile"));
	}
	
	@Test
	public void testPost(){
		given()
			.param("name", "ml0tester")
			.param("password", "123456")
		.when()
			.post("https://my.worktile.com/api/user/signin").prettyPeek()
		.then()
			.statusCode(200)
			.body("code", equalTo(500));
	}
}
