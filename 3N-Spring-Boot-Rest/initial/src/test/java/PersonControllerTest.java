import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Application;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.preemptive;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = RANDOM_PORT)
public class PersonControllerTest {

  @Value("${local.server.port}")
  private int port;

  @Before
  public void setUp() {
    RestAssured.authentication = preemptive().basic("admin", "passw0rd");
  }

  @Test
  public void shouldSayHello() {
    get("http://localhost:" + port + "/demo/topics")
      .then()
      .assertThat()
      .statusCode(200)
      .body("id", Matchers.equalTo("0"))
      .and()
      .body("name", Matchers.equalTo("nacho"));
  }
}