package net.moewes.cloudui.example.multiview;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;

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
        UiComponent component = new UiComponent("cloudui-view");
        component.getElement().setAttribute("backend", backend);
        return component;
    }
}
