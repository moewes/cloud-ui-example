package net.moewes.cloudui.example.cdibinder;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.html.H1;

@CloudUiView("/myview")
public class MyView extends Div {

    public MyView() {

        H1 title = new H1("MyView");
        add(title);

    }
}
