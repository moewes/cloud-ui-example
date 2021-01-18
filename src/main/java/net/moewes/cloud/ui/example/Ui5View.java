package net.moewes.cloud.ui.example;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloudui.ui5.Ui5Link;
import net.moewes.cloudui.ui5.Ui5Title;

@CloudUiView("/ui5Elements")
public class Ui5View extends Div {

    public Ui5View() {

        add(new Ui5Title("Ui5 Elements"));

        add(new Ui5Link("Avatar", "/ui5/avatar"));
        add(new Ui5Link("Avatar Group", "/ui5/avatarGroup"));
        add(new Ui5Link("Badge", "/ui5/badge"));
        add(new Ui5Link("Bar", "/ui5/bar"));
        add(new Ui5Link("Button", "/ui5/button"));
        add(new Ui5Link("Calendar", "/ui5/calendar"));
        add(new Ui5Link("Card", "/ui5/card"));
        add(new Ui5Link("Carousel", "/ui5/carousel"));
        add(new Ui5Link("Check Box", "/ui5/ceckbox"));
        add(new Ui5Link("Combo Box", "/ui5/combobox"));
        add(new Ui5Link("Icon", "/ui5/icon"));
        add(new Ui5Link("Input", "/ui5/input"));
        add(new Ui5Link("Label", "/ui5/label"));
        add(new Ui5Link("Link", "/ui5/link"));
        add(new Ui5Link("Panel", "/ui5/panel"));
        add(new Ui5Link("Timeline", "/ui5/timeline"));
        add(new Ui5Link("Title", "/ui5/title"));

        getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");
    }
}
