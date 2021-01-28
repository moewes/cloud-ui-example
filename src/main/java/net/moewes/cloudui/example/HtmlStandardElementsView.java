package net.moewes.cloudui.example;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;
import net.moewes.cloudui.html.H2;
import net.moewes.cloudui.html.H3;
import net.moewes.cloudui.html.H4;
import net.moewes.cloudui.html.H5;
import net.moewes.cloudui.html.H6;

@CloudUiView("/htmlElements")
public class HtmlStandardElementsView extends Div {

    public HtmlStandardElementsView() {

        getElement().setAttribute("style", "padding: 1em");
        
        add(new H1("H1 Title"));
        add(new H2("H2 Title"));
        add(new H3("H3 Title"));
        add(new H4("H4 Title"));
        add(new H5("H5 Title"));
        add(new H6("H6 Title"));

    }
}
