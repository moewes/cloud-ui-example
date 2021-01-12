package net.moewes.cloud.ui.example.ui5;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.ui5.Ui5Title;

@CloudUiView("/ui5/label")
public class LabelView extends Div {

    public LabelView() {

        add(new Ui5Title("Label"));
    }
}
