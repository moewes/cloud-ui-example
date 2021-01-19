package net.moewes.cloudui.example.vaadin;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Label;
import net.moewes.cloudui.vaadin.FormLayout;
import net.moewes.cloudui.vaadin.TextField;
import net.moewes.cloudui.vaadin.VerticalLayout;

@CloudUiView("/vaadin/form")
public class FormLayoutView extends VerticalLayout {

    public FormLayoutView() {

        //getElement().setAttribute("theme", "spacing");
        //add(new Ui5Title("Label"));

        //Ui5Panel panel = new Ui5Panel("Basic Label", true);
        //add(panel);

        FormLayout form = new FormLayout();
        Label nameLabel = new Label("Name");
        TextField nameField = new TextField();
        form.addFormItem(nameField, nameLabel);
        Label titleLabel = new Label("Title");
        TextField titleField = new TextField();
        form.addFormItem(titleField, titleLabel);
        Label label = new Label("Very long label with some Words");
        TextField field = new TextField();
        // field.getElement().setAttribute("class", "full-width");
        form.addFormItem(field, label);

        //panel.add(form);

        add(form);

    }
}
