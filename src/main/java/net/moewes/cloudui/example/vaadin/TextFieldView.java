package net.moewes.cloudui.example.vaadin;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.vaadin.Details;
import net.moewes.cloudui.vaadin.FormLayout;
import net.moewes.cloudui.vaadin.VerticalLayout;
import net.moewes.cloudui.vaadin.input.EmailField;
import net.moewes.cloudui.vaadin.input.IntegerField;
import net.moewes.cloudui.vaadin.input.NumberField;
import net.moewes.cloudui.vaadin.input.PasswordField;
import net.moewes.cloudui.vaadin.input.TextArea;
import net.moewes.cloudui.vaadin.input.TextField;

@CloudUiView("/vaadin/textField")
public class TextFieldView extends VerticalLayout {

    private TextField textfield = new TextField();
    private NumberField numberField = new NumberField();
    private IntegerField integerField = new IntegerField();
    private PasswordField passwordField = new PasswordField();
    private EmailField emailField = new EmailField();
    private TextArea textArea = new TextArea();

    public TextFieldView() {

        getElement().setAttribute("style", "padding: 1em");

        FormLayout form = new FormLayout();

        textfield.setLabel("Text Field");

        numberField.setLabel("Number Field");

        integerField.setLabel("Integer Field");

        emailField.setLabel("Email Field");

        textArea.setLabel("Text Area");

        passwordField.setLabel("Password Field");

        form.add(textfield, numberField, integerField, emailField, textArea, passwordField);
        add(form);

        Details textAreaDetails = new Details("Text Area with min and max height");
        add(textAreaDetails);

        TextArea minmaxHeightArea = new TextArea();
        textAreaDetails.add(minmaxHeightArea);
        minmaxHeightArea.setMinHeight("150px");
        minmaxHeightArea.setMaxHeight("200px");

        Details validationDetails = new Details("Validation");
        add(validationDetails);
        VerticalLayout validationLayout = new VerticalLayout();
        validationDetails.add(validationLayout);

        TextField validationField = new TextField();
        validationField.setLabel("required and length between 2 and 4");
        validationField.setRequired(true);
        validationField.setErrorMessage("length must be between 2 and 4 characters");
        validationField.setMinlength(2);
        validationField.setMaxlength(4);

        TextField patternField = new TextField();
        patternField.setLabel("Flight Number");
        patternField.setPattern("[A-Z]{2}\\d{3,4}");
        patternField.setErrorMessage("Not a valid flight number");
        //patternField.setPreventInvalidInput(true);

        TextField serverInvalid = new TextField();
        serverInvalid.setLabel("Serverside invalid");
        serverInvalid.setErrorMessage("Message from Server");
        serverInvalid.setValue("invalid");
        serverInvalid.getElement().setAttribute("invalid", "true");


        validationLayout.add(validationField, patternField, serverInvalid);

        Details numberDetails = new Details("Number Fields");
        add(numberDetails);
        VerticalLayout numberLayout = new VerticalLayout();
        numberDetails.add(numberLayout);

        NumberField numberStepField = new NumberField();
        numberStepField.setLabel("Number Field");
        numberStepField.setHasControls(true);
        numberStepField.setStep(0.2d);

        IntegerField integerField = new IntegerField();
        integerField.setLabel("Integer Field");
        integerField.setHasControls(true);
        integerField.setMinValue(-20);
        integerField.setMaxValue(+20);
        integerField.setStep(5);

        numberLayout.add(numberStepField, integerField);

        Details passwordDetails = new Details("Password Field");
        add(passwordDetails);
        FormLayout passwordForm = new FormLayout();
        passwordDetails.add(passwordForm);

        PasswordField pw1 = new PasswordField();
        pw1.setLabel("Password");
        pw1.setValue("secret");
        pw1.setAutoselect(true);

        PasswordField pw2 = new PasswordField();
        pw2.setLabel("Password without reveal button");
        pw2.setValue("secret");
        pw2.hideRevealButton(true);

        passwordForm.add(pw1, pw2);

        Details prefixDetails = new Details("Suffix and Prefix");
        add(prefixDetails);
        VerticalLayout prefixLayout = new VerticalLayout();
        prefixDetails.add(prefixLayout);

        NumberField suffixField = new NumberField();
        suffixField.setValue("1000"); // TODO
        Div suffix = new Div();
        suffix.setInnerHtml("€");
        // TODO Theme Variant
        suffixField.addSuffix(suffix);
        NumberField prefixField = new NumberField();
        prefixField.setValue("1000"); // TODO
        Div prefix = new Div();
        prefix.setInnerHtml("$");
        prefixField.addPrefix(prefix);

        prefixLayout.add(prefixField, suffixField);
    }
}
