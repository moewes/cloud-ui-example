package net.moewes.cloudui.example.ui5;

import javax.inject.Inject;

import net.moewes.cloud.ui.UiComponent;
import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.example.Ui5View;
import net.moewes.cloudui.ui5.Ui5Bar;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Card;
import net.moewes.cloudui.ui5.Ui5Carousel;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;

@CloudUiView("/ui5/carousel")
public class CarouselView extends Div {

    @Inject
    public CarouselView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Carousel"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        UiComponent img1 = new UiComponent("img");
        img1.getElement().setAttribute("src", "https://sap.github.io/ui5-webcomponents/assets/images/sample1.jpg");
        UiComponent img2 = new UiComponent("img");
        img2.getElement().setAttribute("src", "https://sap.github.io/ui5-webcomponents/assets/images/sample2.jpg");
        UiComponent img3 = new UiComponent("img");
        img3.getElement().setAttribute("src", "https://sap.github.io/ui5-webcomponents/assets/images/sample3.jpg");

        Ui5Panel panel1 = new Ui5Panel("Carousel With Single Item per Page", true);
        add(panel1);

        Ui5Carousel carousel1 = new Ui5Carousel();
        panel1.add(carousel1);

        carousel1.add(img1, img2, img3);

        Ui5Panel panel2 = new Ui5Panel("Carousel With Multiple Items per Page", true);
        add(panel2);

        Ui5Carousel carousel2 = new Ui5Carousel();
        panel2.add(carousel2);

        Ui5Card card1 = new Ui5Card();
        card1.setHeading("Card 1");
        card1.add(new Ui5Label("Card 1 content!"));

        Ui5Card card2 = new Ui5Card();
        card2.setHeading("Card 2");
        card2.add(new Ui5Label("Card 2 content!"));

        Ui5Card card3 = new Ui5Card();
        card3.setHeading("Card 3");
        card3.add(new Ui5Label("Card 3 content!"));

        Ui5Card card4 = new Ui5Card();
        card4.setHeading("Card 4");
        card4.add(new Ui5Label("Card 4 content!"));
        carousel2.add(card1, card2, card3, card4);

        carousel2.setItemPerPageM(2);
        carousel2.setItemPerPageL(3);

        Ui5Panel panel3 = new Ui5Panel("Carousel With Arrow Placement, SelectedIndex and Cyclic", true);
        add(panel3);

        Ui5Carousel carousel3 = new Ui5Carousel();
        panel3.add(carousel3);

        carousel3.setCyclic(true);
        carousel3.setArrowsPlacement(Ui5Carousel.ArrowsPlacement.NAVIGATION);
        carousel3.setSelectedIndex(2);
        carousel3.add(img1, img2, img3);

    }
}
