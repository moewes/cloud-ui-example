package net.moewes.cloud.ui.example.ui5;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.example.Ui5View;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;
import net.moewes.cloud.ui.ui5.Ui5Bar;
import net.moewes.cloud.ui.ui5.Ui5Button;
import net.moewes.cloud.ui.ui5.Ui5ComboBox;
import net.moewes.cloud.ui.ui5.Ui5InputBase;
import net.moewes.cloud.ui.ui5.Ui5Label;
import net.moewes.cloud.ui.ui5.Ui5Panel;

@CloudUiView("/ui5/combobox")
public class ComboboxView extends Div {

    @Inject
    public ComboboxView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Combo Box"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        Ui5Panel panel = new Ui5Panel("Basic Combo Box", true);
        add(panel);

        List<String> myItems = new ArrayList<>();
        myItems.add("Item 1");
        myItems.add("Item 2");
        myItems.add("Item 3");

        Ui5ComboBox cb1 = new Ui5ComboBox();
        cb1.setPlaceholder("Enter value");
        cb1.setItems(myItems);

        Ui5ComboBox cb2 = new Ui5ComboBox();
        cb2.setPlaceholder("Enter value");
        cb2.setItems(myItems);
        cb2.setValueState(Ui5InputBase.ValueState.SUCCESS);
        cb2.setValue("Item 1");

        Div container = new Div();
        container.getElement().setAttribute("style", "display: flex; flex-direction: row; gap: 0.5em");
        container.add(cb1, cb2);
        panel.add(container);

    }
}
