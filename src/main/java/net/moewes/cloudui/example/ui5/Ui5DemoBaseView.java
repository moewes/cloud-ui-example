package net.moewes.cloudui.example.ui5;

import javax.inject.Inject;

import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.example.Ui5View;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Bar;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Label;

public abstract class Ui5DemoBaseView extends Div {

    @Inject
    CloudUi ui;

    public Ui5DemoBaseView(String componentName) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label(componentName));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);
    }
}
