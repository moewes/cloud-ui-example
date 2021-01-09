package net.moewes.cloud.ui.example;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.ui5.Ui5Link;

@CloudUiView("/ui5Elements")
public class Ui5View extends Div {

    public Ui5View() {

        add(new Ui5Link("Avatar", "/ui5/avatar"));
        add(new Ui5Link("Link", "/ui5/link"));
        add(new Ui5Link("Panel", "/ui5/panel"));
        add(new Ui5Link("Timeline", "/ui5/timeline"));
        add(new Ui5Link("Title", "/ui5/title"));
        add(new Ui5Link("old example: buttons, icons, label and input", "/ui5/ui5Elements"));

        getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");
    }
}
