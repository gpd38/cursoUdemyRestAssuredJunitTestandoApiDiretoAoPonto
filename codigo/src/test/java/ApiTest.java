import org.junit.Test;
import static io.restassured.RestAssured.*;

public class ApiTest {

    @Test
    public void cadastro(){
        String url = "http://api.thecatapi.com/v1/user/passwordlessignup";
        String corpo= "{\"email\":\"gustavodias2@gmail.com\",\"appDescription\":\"Validando API THECAT\"}";

        given().contentType("application/json").body(corpo).
        when().post(url).
        then().statusCode(200);
//live_xQXc3p9hDvdAj3SBilZ5JpId67trwVb4y4mDylXZSEqHU4a9atIkKz8TEKUHTECP
    }
}
