package net.moewes.cloudui.example.cdibinder;

import java.util.Random;


import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
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
