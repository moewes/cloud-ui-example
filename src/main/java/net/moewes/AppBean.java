package net.moewes;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import lombok.Getter;

@ApplicationScoped
@Getter
public class AppBean {

  private int value;

  @PostConstruct
  public void init() {
    Random random = new Random();
    value = random.nextInt();
  }

}
