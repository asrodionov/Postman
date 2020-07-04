import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanTest {
    @Test
    void shouldPostData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                // Выполняемые действия
                .when()
                    .post("/post")
                // Проверки
                .then()
                    .statusCode(200)
                    .assertThat().body("data", equalTo("some data"))
        ;
    }
}
