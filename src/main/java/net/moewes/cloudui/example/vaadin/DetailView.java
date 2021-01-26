package net.moewes.cloudui.example.vaadin;

import java.util.Arrays;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.vaadin.Details;

@CloudUiView("/vaadin/detail")
public class DetailView extends Div {

    public DetailView() {

        Arrays.stream(Details.Themes.values()).forEach(theme -> {
            Details detail = new Details(theme.name());
            detail.setTheme(theme);
            add(detail);
        });
    }
}
