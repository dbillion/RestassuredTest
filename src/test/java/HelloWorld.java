import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HelloWorld {

    @Test
    public void checkEmployeeStatus() {
        // @formatter:off
        given().
                when().
                get("http://dummy.restapiexample.com/api/v1/employees").
                then().
                assertThat().
                log().ifValidationFails().statusCode(200);
        // @formatter:on
    }
}