package net.moewes;

import java.util.Random;
import javax.inject.Inject;
import net.moewes.cloud.ui.UiBinder;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;

@CloudUiView("/example")
public class ExampleView extends UiComponent {

  private AppBean appBean;

  private SBean sBean;

  private ReqBean reqBean;

  private ExampleModel model;

  private int counter = 0;

  @Inject
  public ExampleView(ReqBean reqBean, AppBean appBean) {
    super("div");
    setId("top");

    this.reqBean = reqBean;
    this.sBean = sBean;
    this.appBean = appBean;

    Random random = new Random();
    this.counter = random.nextInt();

    UiComponent title = new UiComponent("h1");
    title.setInnerHtml("BeispielView " + counter);
    title.setId("id_1");

    add(title);

    UiComponent xtst = new UiComponent("h2");
    xtst.setInnerHtml("Values " + appBean.getValue() + " (A) "  + reqBean.getValue() + "(R)");
    xtst.setId("id_1");

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
    uiBinder.bind(input, model, model::getValue, value -> model.setValue((String) value));

    UiComponent button = new UiComponent("button");
    button.setInnerHtml("Send to Backend");
    button.addEventListener("click", event -> {
      System.out.println("Event");
      model.setValue("Handler Event");
      this.counter = this.counter + 1;
      handleEvent();
      return null; // FIXME
    });

    add(button);
  }

  public void handleEvent() {

    System.out.println("EventHandler");
    System.out.println("Model value" + model.getValue());
  }
}
