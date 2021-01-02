package net.moewes.cloud.ui.example.vaadin;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.vaadin.AppLayout;
import net.moewes.cloud.ui.vaadin.Tab;
import net.moewes.cloud.ui.vaadin.Tabs;

@CloudUiView("/vaadinAppLayout")
public class AppLayoutView extends AppLayout {

    public AppLayoutView() {

        UiComponent contentOne = new UiComponent("vaadin-item"); // TODO
        contentOne.setInnerHtml("<p>Content Tab One</p>");
        add(contentOne);

        UiComponent nav = new UiComponent("vaadin-item"); // TODO
        nav.setInnerHtml("AppLayout");
        nav.getElement().setAttribute("slot", "navbar");
        add(nav);

        UiComponent toggle = new UiComponent("vaadin-drawer-toggle"); // TODO
        //nav.setInnerHtml("AppLayout");
        toggle.getElement().setAttribute("slot", "navbar");
        add(toggle);

        Tabs menu = new Tabs();
        menu.getElement().setAttribute("slot", "drawer");
        menu.getElement().setAttribute("orientation", "vertical");

        Tab menuItem1 = new Tab();
        menuItem1.setInnerHtml("Test");

        menu.add(menuItem1);

        add(menu);
    }
}
