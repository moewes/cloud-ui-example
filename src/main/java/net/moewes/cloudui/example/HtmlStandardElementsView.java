package net.moewes.cloudui.example;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;
import net.moewes.cloud.ui.html.H2;
import net.moewes.cloud.ui.html.H3;
import net.moewes.cloud.ui.html.H4;
import net.moewes.cloud.ui.html.H5;
import net.moewes.cloud.ui.html.H6;

@CloudUiView("/htmlElements")
public class HtmlStandardElementsView extends Div {

    public HtmlStandardElementsView() {

        add(new H1("H1 Title"));
        add(new H2("H2 Title"));
        add(new H3("H3 Title"));
        add(new H4("H4 Title"));
        add(new H5("H5 Title"));
        add(new H6("H6 Title"));

    }
}
