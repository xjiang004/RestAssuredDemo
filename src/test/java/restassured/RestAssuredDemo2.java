package restassured;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredDemo2 {
	
	@Test
	public void testGet(){
		useRelaxedHTTPSValidation();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("topics", "topics");
		map.put("topicid", 12192);
		
		get("https://testerhome.com/{topics}/{topicid}", map)
		.then().statusCode(200);
	}
	
	@Test
	public void testPost(){
		given()
			.param("user[login]", "l_smile")
			.param("user[password]", "min0601")
		.when()
			.post("https://testerhome.com/account/sign_in")
		.then().statusCode(302);
	}
	
	@Test
	public void testJson(){
		when().get("https://testerhome.com/api/v3/topics.json")
		.then()
			.statusCode(200)
			.body("topics.id[0]", equalTo(12869))
			.time(lessThan(2000L))
			;
	}
}
