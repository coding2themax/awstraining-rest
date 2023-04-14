package coding2themax.aws.training.springsample.router;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.reactive.server.WebTestClient;

import coding2themax.aws.training.springsample.handler.CrashFactorHandler;


@WebFluxTest
@ContextConfiguration( classes={CrashFactorHandler.class, CrashFactorRouter.class})
public class CrashFactorRouterTest {


  @Autowired
  private ApplicationContext context;
  
  private WebTestClient webTestClient;

  @BeforeEach
  public void setUp() {
    webTestClient = WebTestClient.bindToApplicationContext(context).build();
  }


  @Test
  void testMessageRoute() {

    webTestClient.get().uri("/crashfactor").accept(MediaType.APPLICATION_JSON).exchange().expectStatus().is2xxSuccessful();
  }
}
