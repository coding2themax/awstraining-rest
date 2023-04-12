package coding2themax.aws.training.springsample.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrashFactorTest {


  CrashFactor cf;

  @BeforeEach
  void setUp(){

    cf = new CrashFactor("test description", 1000l, 90);
  }

  @Test
  void getters() {
    Assertions.assertAll("getters", () ->{
      Assertions.assertEquals("test description", cf.getDescription());
      Assertions.assertEquals(1000l, cf.getFrequency());
      Assertions.assertEquals(90, cf.getWeightedPercent());
    });
  }



  @Test
  void setters() {

    Assertions.assertAll("setters", ()->{
      cf.setDescription("testother");
      Assertions.assertEquals("testother", cf.getDescription());

    },
    ()->{
      cf.setFrequency(2000l);
      Assertions.assertEquals(2000l, cf.getFrequency());

    },
    ()->{
      cf.setWeightedPercent(50);
      Assertions.assertEquals(50, cf.getWeightedPercent());

    });

  }

 
}
