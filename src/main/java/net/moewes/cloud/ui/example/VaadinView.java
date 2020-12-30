package net.moewes.cloud.ui.example;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.vaadin.Notification;
import net.moewes.cloud.ui.vaadin.TextField;
import net.moewes.cloud.ui.vaadin.VerticalLayout;

@CloudUiView("/vaadin")
public class VaadinView extends VerticalLayout {

    public VaadinView() {

        UiComponent field = new UiComponent("vaadin-text-field");
        field.setValue("value");
        field.getElement().setAttribute("label", "My Vaadin Textfield:");
        add(field);

        TextField field1 = new TextField();
        add(field1);

        TextField field2 = new TextField();
        field2.setLabel("Field Label");
        field2.setRequired(true);
        field2.setPlaceholder("placeholder");
        add(field2);

        UiComponent button = new UiComponent("vaadin-button");
        button.setInnerHtml("Vaadin Button");
        add(button);

        button.addEventListener("click", event -> {
            Notification notification = new Notification("Hello");
            notification.setDuration(1000);
            add(notification);
            notification.open();
        });
    }

}
