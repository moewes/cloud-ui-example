package net.moewes.cloud.ui.example.vaadin;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.vaadin.AppLayout;

@CloudUiView("/vaadinAppLayout")
public class AppLayoutView extends AppLayout {

    public AppLayoutView() {

        UiComponent contentOne = new UiComponent("vaadin-item"); // TODO
        contentOne.setInnerHtml("<p>Content Tab One</p>");
        add(contentOne);
    }
}
