package net.moewes;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.ui5.Ui5Button;
import net.moewes.cloud.ui.ui5.Ui5Button.Design;
import net.moewes.cloud.ui.ui5.Ui5Input;
import net.moewes.cloud.ui.ui5.Ui5Label;

@CloudUiView("/ui5Elements")
public class Ui5View extends Div {

  public Ui5View() {

    getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");

    Div buttonContainer = new Div();

    Ui5Button button = new Ui5Button();
    button.setText("Default");
    button.setDesign(Design.Default);
    buttonContainer.add(button);

    Ui5Button button2 = new Ui5Button();
    button2.setText("Emphasized");
    button2.setDesign(Design.Emphasized);
    buttonContainer.add(button2);

    Ui5Button button3 = new Ui5Button();
    button3.setDesign(Design.Positive);
    button3.setText("Positive");
    buttonContainer.add(button3);

    Ui5Button button4 = new Ui5Button();
    button4.setDesign(Design.Negative);
    button4.setText("Negative");
    buttonContainer.add(button4);

    Ui5Button button5 = new Ui5Button();
    button5.setDesign(Design.Transparent);
    button5.setText("Transparent");
    buttonContainer.add(button5);

    buttonContainer.getElement()
        .setAttribute("style", "display: flex; flex-direction: row; gap: 0.5em");

    add(buttonContainer);

    Div formContainer = new Div();

    Ui5Input nameField = new Ui5Input();
    Ui5Label nameLabel = new Ui5Label();
    formContainer.add(nameLabel);
    formContainer.add(nameField);
    nameLabel.setFor(nameField);
    nameLabel.setText("Name");

    add(formContainer);

    add(getIcon("add-document"));
    add(getIcon("add-equipment"));

  }

  private UiComponent getIcon(String name) {
    UiComponent component = new UiComponent("ui5-icon");
    component.getElement().setAttribute("name", name);
    return component;
  }
}
