package net.moewes;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import lombok.Getter;

@SessionScoped
@Getter
public class SBean {

  private int value;

  @PostConstruct
  public void init() {
    Random random = new Random();
    value = random.nextInt();
  }

}
