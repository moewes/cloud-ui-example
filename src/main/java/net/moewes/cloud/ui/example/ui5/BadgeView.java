package net.moewes.cloud.ui.example.ui5;

import java.util.Arrays;

import javax.inject.Inject;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.example.Ui5View;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Badge;
import net.moewes.cloudui.ui5.Ui5Bar;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Icon;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;

@CloudUiView("/ui5/badge")
public class BadgeView extends Div {

    @Inject
    public BadgeView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Badge"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        Ui5Panel panel = new Ui5Panel("Basic Badge", true);
        add(panel);

        Arrays.stream(Ui5Badge.ColorScheme.values()).forEach(design -> {
            Ui5Badge badge = new Ui5Badge("Color Scheme " + (design.ordinal() + 1));
            badge.setColorScheme(design);
            panel.add(badge);
        });

        Ui5Panel panel2 = new Ui5Panel("Badge with Icon", true);
        add(panel2);

        panel2.add(new Ui5Badge("Employee", new Ui5Icon("employee")));
        panel2.add(new Ui5Badge(new Ui5Icon("employee")));
    }
}
