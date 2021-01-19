package net.moewes.cloudui.example.ui5;

import javax.inject.Inject;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.example.Ui5View;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Bar;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Card;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5Timeline;
import net.moewes.cloudui.ui5.Ui5TimelineItem;
import net.moewes.cloudui.ui5.Ui5Title;
import net.moewes.cloudui.vaadin.Notification;

@CloudUiView("/ui5/card")
public class CardView extends Div {

    @Inject
    public CardView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Card"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        Ui5Panel panel = new Ui5Panel("Basic Card", true);
        add(panel);

        Ui5Card card = new Ui5Card();
        card.setHeading("Heading");
        card.setSubHeading("SubHeading");
        card.setStatustext("Status");
        // card.getElement().setAttribute("class", "medium");
        Div container = new Div();
        container.getElement().setAttribute("style", "padding: var(--_ui5_card_content_padding);");

        container.add(new Ui5Title("Title"), new Ui5Label("Label"));
        card.add(container);
        panel.add(card);

        Ui5Card timelineCard = new Ui5Card();
        panel.add(timelineCard);
        timelineCard.setHeading("Timeline");
        timelineCard.setSubHeading("Today");
        timelineCard.interactiveHeader(true);
        timelineCard.addIcon("calendar");
        timelineCard.addActionElement(new Ui5Button("Test"));

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
        Ui5Timeline timeline = new Ui5Timeline();
        timeline.add(item1, item2);
        timelineCard.add(timeline);

        timelineCard.addEventListener("header-click", event -> {
            Notification notification = new Notification();
            add(notification);
            notification.setDuration(2000);
            notification.setText("Card Header clicked");
            notification.open();
        });
    }
}
