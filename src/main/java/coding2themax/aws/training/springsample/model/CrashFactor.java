package coding2themax.aws.training.springsample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CrashFactor {
  
  private String description;
  private Long frequency;
  private Integer weightedPercent;

}
