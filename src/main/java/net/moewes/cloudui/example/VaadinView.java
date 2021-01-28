package net.moewes.cloudui.example;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Link;
import net.moewes.cloudui.ui5.Ui5Title;
import net.moewes.cloudui.vaadin.VerticalLayout;

@CloudUiView("/vaadin")
public class VaadinView extends VerticalLayout {

    public VaadinView() {

        getElement().setAttribute("style", "padding: var(--_ui5_card_content_padding); display: flex; flex-direction: column; gap: 0.1em");

        add(new Ui5Title("Vaadin Elements"));

        add(new Ui5Link("App Layout", "/vaadin/appLayout"));
        add(new Ui5Link("Button", "/vaadin/button"));
        add(new Ui5Link("Details", "/vaadin/details"));
        add(new Ui5Link("Form Layout", "/vaadin/formLayout"));
        add(new Ui5Link("Notification", "/vaadin/notification"));
        add(new Ui5Link("Tabs", "/vaadin/tabs"));
        add(new Ui5Link("Text Field", "/vaadin/textField"));

    }

}
