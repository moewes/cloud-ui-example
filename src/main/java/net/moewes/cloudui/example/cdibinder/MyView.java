package net.moewes.cloudui.example.cdibinder;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;

@CloudUiView("/myview")
public class MyView extends Div {

    public MyView() {

        H1 title = new H1("MyView");
        add(title);

    }
}
