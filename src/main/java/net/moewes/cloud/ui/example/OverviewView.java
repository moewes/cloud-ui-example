package net.moewes.cloud.ui.example;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;

@CloudUiView("/overview")
public class OverviewView extends Div {

  public OverviewView() {

    add(new H1("Cloud UI Overview"));

    Div container = new Div();
    container.add(getLink("Todo App", "/todos"));
    add(container);

    container = new Div();
    container.add(getLink("Standard HTML Elements", "/htmlElements"));
    add(container);

    container = new Div();
    container.add(getLink("UI5 Elements", "/ui5Elements"));
    add(container);

    container = new Div();
    container.add(getLink("Multiple Views", "/multiViews"));
    add(container);

  }

  private UiComponent getLink(String title, String url) {
    UiComponent anchor = new UiComponent("a");
    anchor.setInnerHtml(title);
    anchor.getElement().setAttribute("href", url);
    return anchor;
  }
}
