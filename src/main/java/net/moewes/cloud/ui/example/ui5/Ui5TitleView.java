package net.moewes.cloud.ui.example.ui5;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.ui5.Ui5Panel;
import net.moewes.cloud.ui.ui5.Ui5Title;

@CloudUiView("/ui5/title")
public class Ui5TitleView extends Div {

    public Ui5TitleView() {

        add(new Ui5Title("Title", Ui5Title.Level.H1));

        Ui5Panel panel = new Ui5Panel("Title in All Available Levels", true);

        panel.add(new Ui5Title("Title Level 1", Ui5Title.Level.H1));
        panel.add(new Ui5Title("Title Level 2", Ui5Title.Level.H2));
        panel.add(new Ui5Title("Title Level 3", Ui5Title.Level.H3));
        panel.add(new Ui5Title("Title Level 4", Ui5Title.Level.H4));
        panel.add(new Ui5Title("Title Level 5", Ui5Title.Level.H5));
        panel.add(new Ui5Title("Title Level 6", Ui5Title.Level.H6));

        add(panel);
    }
}
