package coding2themax.aws.training.springsample.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import coding2themax.aws.training.springsample.handler.CrashFactorHandler;

@Configuration
public class CrashFactorRouter {
  
  @Bean
  public RouterFunction<ServerResponse> messageRoute(CrashFactorHandler handler){
    return RouterFunctions.route(RequestPredicates.GET("/crashfactor")
      .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::getCrashFactors);
  }
}
