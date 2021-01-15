package net.moewes.cloud.ui.example.vaadin;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Label;
import net.moewes.cloud.ui.ui5.Ui5Input;
import net.moewes.cloud.ui.ui5.Ui5Label;
import net.moewes.cloud.ui.vaadin.FormLayout;
import net.moewes.cloud.ui.vaadin.TextField;
import net.moewes.cloud.ui.vaadin.VerticalLayout;

@CloudUiView("/vaadin/form")
public class FormLayoutView extends VerticalLayout {

    public FormLayoutView() {

        getElement().setAttribute("theme", "spacing");
        //add(new Ui5Title("Label"));

        //Ui5Panel panel = new Ui5Panel("Basic Label", true);
        //add(panel);

        FormLayout form = new FormLayout();
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        form.addFormItem(nameField, nameLabel);
        Ui5Label titleLabel = new Ui5Label("Title");
        Ui5Input titleField = new Ui5Input();
        form.addFormItem(titleField, titleLabel);
        Ui5Label label = new Ui5Label("Very long label with some Words");
        Ui5Input field = new Ui5Input();
        form.addFormItem(field, label);

        //panel.add(form);

        add(form);

    }
}
