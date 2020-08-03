package net.moewes;

import java.util.Random;
import javax.inject.Inject;
import net.moewes.cloud.ui.UiBinder;
import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;

@CloudUiView("/second")
public class SecondView extends UiComponent {

  private AppBean appBean;

  private SBean sBean;

  private ReqBean reqBean;

  private ExampleModel model;

  private int counter = 0;

  @Inject
  public SecondView(ReqBean reqBean, AppBean appBean) {
    super("div");
    setId("top");

    this.reqBean = reqBean;
    this.appBean = appBean;

    Random random = new Random();
    this.counter = random.nextInt();

    UiComponent title = new UiComponent("h1");
    title.setInnerHtml("Second View");
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
    uiBinder.bind(input, model, appBean::getValue, null);

    UiComponent button = new UiComponent("button");
    button.setInnerHtml("Send to Backend");
    button.addEventListener("click", event -> {
      System.out.println("Event");
      model.setValue("Aus dem Handler gesetzt");
      this.counter = this.counter + 1;
      handleEvent();
      return null; // FIXME
    });

    add(button);
  }

  public void handleEvent() {

    System.out.println("EventHandler");
    System.out.println("Wert im Model" + model.getValue());
  }
}
