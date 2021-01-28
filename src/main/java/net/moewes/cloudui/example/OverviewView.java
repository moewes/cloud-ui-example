package net.moewes.cloudui.example;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H2;
import net.moewes.cloudui.ui5.Ui5Card;

@CloudUiView("/")
public class OverviewView extends Div {

    public OverviewView() {

        UiComponent shell = new UiComponent("ui5-shellbar");
        add(shell);
        shell.getElement().setAttribute("primary-title", "CloudUi Examples");

        Div cardLayout = new Div();
        cardLayout.getElement().setAttribute("style", "display: flex; flex-direction: row; box-sizing: border-box; flex-wrap: wrap; gap:1em; padding: 1em;");
        add(cardLayout);

        Ui5Card ui5Card = new Ui5Card();
        ui5Card.getElement().setAttribute("style", "width:30em");
        ui5Card.add(getPortlet("net.moewes.cloudui.example.Ui5View"));
        ui5Card.setHeading("UI5 Examples");
        cardLayout.add(ui5Card);

        Ui5Card vaadinCard = new Ui5Card();
        vaadinCard.getElement().setAttribute("style", "width:30em");
        vaadinCard.add(getPortlet("net.moewes.cloudui.example.VaadinView"));
        vaadinCard.setHeading("Vaadin Examples");
        cardLayout.add(vaadinCard);

        Ui5Card coreCard = new Ui5Card();
        coreCard.getElement().setAttribute("style", "width:30em");
        coreCard.setHeading("Core Examples");
        Div coreContainer = new Div();
        coreCard.add(coreContainer);
        coreContainer.getElement().setAttribute("style", "padding: var(--_ui5_card_content_padding);");
        cardLayout.add(coreCard);

        coreContainer.add(new H2("CloudUI Examples Overview"));

        Div container = new Div();
        container.add(getLink("Todo App", "/todos"));
        coreContainer.add(container);

        container = new Div();
        container.add(getLink("Standard HTML Elements", "/htmlElements"));
        coreContainer.add(container);

        container = new Div();
        container.add(getLink("UI5 Elements", "/ui5Elements"));
        coreContainer.add(container);

        container = new Div();
        container.add(getLink("Multiple Views", "/multiViews"));
        coreContainer.add(container);
        
    }

    private UiComponent getLink(String title, String url) {
        UiComponent anchor = new UiComponent("a");
        anchor.setInnerHtml(title);
        anchor.getElement().setAttribute("href", url);
        return anchor;
    }

    private UiComponent getPortlet(String backend) {
        UiComponent component = new UiComponent("cloudui-view");
        component.getElement().setAttribute("backend", backend);
        return component;
    }
}
