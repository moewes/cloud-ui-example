package net.moewes.cloud.ui.example.ui5;

import java.util.Arrays;
import java.util.Optional;

import net.moewes.cloud.ui.annotations.CloudUiView;
import net.moewes.cloud.ui.html.Div;
import net.moewes.cloud.ui.ui5.Ui5Avatar;
import net.moewes.cloud.ui.ui5.Ui5AvatarGroup;
import net.moewes.cloud.ui.ui5.Ui5Panel;
import net.moewes.cloud.ui.ui5.Ui5Title;
import net.moewes.cloud.ui.vaadin.Notification;

@CloudUiView("/ui5/avatarGroup")
public class AvatarGroupView extends Div {

    public AvatarGroupView() {

        add(new Ui5Title("Avatar Group", Ui5Title.Level.H1));

        Ui5Panel panel1 = new Ui5Panel("Basic Avatar", true);
        add(panel1);

        Ui5AvatarGroup group = new Ui5AvatarGroup();
        group.setType(Ui5AvatarGroup.AvatarGroupType.GROUP);
        group.setAvatarSize(Ui5Avatar.Size.S);
        panel1.add(group);

        Ui5Avatar avatar = new Ui5Avatar();
        avatar.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");

        Ui5Avatar avatar2 = new Ui5Avatar();
        avatar2.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar2.setShape(Ui5Avatar.Shape.CIRCLE);

        Ui5Avatar avatar3 = new Ui5Avatar();
        avatar3.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar3.setShape(Ui5Avatar.Shape.SQUARE);

        group.add(avatar, avatar2, avatar3);


        Ui5Panel panel4 = new Ui5Panel("Avatar with Initials and different Color", true);
        add(panel4);

        Ui5AvatarGroup group2 = new Ui5AvatarGroup();
        group2.setType(Ui5AvatarGroup.AvatarGroupType.INDIVIDUAL);
        group2.setAvatarSize(Ui5Avatar.Size.XL);
        panel4.add(group2);

        group2.addEventListener("click", event -> {
            Optional<Object> targetRef = event.getParameter("targetRef");
            //
            Notification notification = new Notification("John Doe" + targetRef.get(), 2000); // TODO
            notification.open();
            add(notification);
        });

        Arrays.stream(Ui5Avatar.BackgroundColor.values()).forEach(backgroundColor -> {
            Ui5Avatar colorAvatar = new Ui5Avatar();
            colorAvatar.setBackgroundColor(backgroundColor);
            colorAvatar.setInitials("MM");
            colorAvatar.setInteractive(true);
            group2.add(colorAvatar);
        });
    }
}
