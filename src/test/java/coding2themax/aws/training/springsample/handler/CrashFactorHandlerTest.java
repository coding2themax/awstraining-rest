package coding2themax.aws.training.springsample.handler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.reactive.function.server.MockServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class CrashFactorHandlerTest {

  @InjectMocks
  CrashFactorHandler handler;

  @Test
  void getFactors(){

    MockServerRequest request = MockServerRequest.builder().build();
    Mono<ServerResponse> mockReponse = handler.getCrashFactors(request);


    StepVerifier.create(mockReponse).assertNext(sr -> {
      sr.statusCode().is2xxSuccessful();
    }).expectComplete().verify();
    
  }

}


