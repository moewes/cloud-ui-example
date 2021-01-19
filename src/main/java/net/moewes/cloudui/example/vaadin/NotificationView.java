package net.moewes.cloudui.example.vaadin;

import java.util.Arrays;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloudui.vaadin.Button;
import net.moewes.cloudui.vaadin.Notification;
import net.moewes.cloudui.vaadin.VerticalLayout;

@CloudUiView("/vaadinNotification")
public class NotificationView extends VerticalLayout {

    public NotificationView() {

        Arrays.stream(Notification.Position.values()).forEach(this::addNotification);
    }

    private void addNotification(Notification.Position position) {

        String text = "Notification with position: " + position.name();
        Notification notification = new Notification(text, 2000, position);
        Button button = new Button(text, event -> {
            notification.open();
        });
        add(notification, button);
    }
}
;