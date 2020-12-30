package net.moewes.cloud.ui.example.multiview;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;

@CloudUiView("/multiViews")
public class MultiView extends Div {

  public MultiView() {

    add(new H1("Multiple Views:"));
    add(getPortlet("net.moewes.cloud.ui.example.HtmlStandardElementsView"));
    add(getPortlet("net.moewes.cloud.ui.example.Ui5View"));
    add(getPortlet("net.moewes.cloud.ui.example.VaadinView"));
    add(getPortlet("net.moewes.cloud.ui.example.todo.TaskListView"));
    add(getPortlet("net.moewes.cloud.ui.example.OverviewView"));
  }

  private UiComponent getPortlet(String backend) {
    UiComponent component = new UiComponent("open-dxp-portlet");
    component.getElement().setAttribute("backend", backend);
    return component;
  }
}
