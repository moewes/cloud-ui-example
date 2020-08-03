package net.moewes;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;

@RequestScoped
@Getter
public class ReqBean {

  private int value;

  @PostConstruct
  public void init() {
    Random random = new Random();
    value = random.nextInt();
  }

}
