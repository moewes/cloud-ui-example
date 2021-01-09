package net.moewes.cloud.ui.example.ui5;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H2;
import net.moewes.cloud.ui.ui5.Ui5Timeline;
import net.moewes.cloud.ui.ui5.Ui5TimelineItem;
import net.moewes.cloud.ui.ui5.Ui5Title;
import net.moewes.cloud.ui.vaadin.Notification;

@CloudUiView("/ui5/timeline") // TODO subpath does not work with events yet
public class Ui5TimelineView extends Div {

    public Ui5TimelineView() {

        add(new Ui5Title("Timeline", Ui5Title.Level.H1));
        add(new H2("Basic Timeline"));

        Ui5Timeline timeline = new Ui5Timeline();

        Ui5TimelineItem item1 = new Ui5TimelineItem();
        item1.setTitle("Item 1 Title");
        item1.setSubtitle("Subtitle");
        item1.setIcon("calendar");

        Ui5TimelineItem item2 = new Ui5TimelineItem();
        item2.setTitle("Item 2 Title");
        item2.setSubtitle("Subtitle");
        item2.setName("John Doe ", true);
        Div content = new Div();
        content.setInnerHtml("Additional Content");
        item2.add(content);

        item2.addEventListener("item-name-click", event -> {
            Notification notification = new Notification("John Doe", 2000);
            notification.open();
            add(notification);
        });

        timeline.add(item1, item2);

        add(timeline);
    }
}
