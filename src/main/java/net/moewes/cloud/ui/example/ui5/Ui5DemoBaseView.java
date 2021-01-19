package net.moewes.cloud.ui.example.ui5;

import javax.inject.Inject;

import net.moewes.cloud.ui.example.Ui5View;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;
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
