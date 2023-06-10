package net.moewes.cloudui.example.cdibinder;

import java.util.Random;
import java.util.UUID;

import jakarta.inject.Inject;
import net.moewes.cloudui.UiBinder;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.quarkus.runtime.CloudUi;

@CloudUiView("/example")
public class ExampleView extends UiComponent {

    private AppBean appBean;
    private ReqBean reqBean;
    private ExampleModel model;
    private int counter;
    private UUID uuid = UUID.randomUUID();

    @Inject
    public ExampleView(ReqBean reqBean, AppBean appBean, CloudUi ui) {
        super("div");

        this.reqBean = reqBean;
        this.appBean = appBean;

        Random random = new Random();
        this.counter = random.nextInt();

        UiComponent title = new UiComponent("h1");
        title.setInnerHtml("BeispielView " + counter);

        add(title);

        UiComponent xtst = new UiComponent("h2");
        xtst.setInnerHtml("Values " + appBean.getValue() + " (A) " + reqBean.getValue() + "(R)");

        add(xtst);

        UiComponent label = new UiComponent("label");
        label.setInnerHtml("Label:");

        UiComponent input = new UiComponent("input");
        input.setValue("Enter your input...");
        UiComponent formField = new UiComponent("div");

        formField.add(label);
        formField.add(input);

        add(formField);

        model = new ExampleModel();
        model.setValue("Model Binder Test");
        UiBinder uiBinder = new UiBinder();
        uiBinder.bind(input, model::getValue, value -> model.setValue((String) value));

        UiComponent button = new UiComponent("button");
        button.setInnerHtml("Send to Backend");
        button.addEventListener("click", event -> {
            System.out.println("Event");
            model.setValue("Handler Event" + ++counter);
        });

        add(button);

        UiComponent button2 = new UiComponent("button");
        button2.setInnerHtml("to second view");
        button2.addEventListener("click", event -> {
            System.out.println("Event 2");
            ui.navigate(SecondView.class);
        });

        add(button2);
    }
}
