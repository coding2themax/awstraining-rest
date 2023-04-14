package coding2themax.aws.training.springsample.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import coding2themax.aws.training.springsample.model.CrashFactor;
import reactor.core.publisher.Mono;

@Component
public class CrashFactorHandler {
  
  public Mono<ServerResponse> getCrashFactors(ServerRequest request){
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(new CrashFactor("test-description", 10000l, 51)));
  }


}
