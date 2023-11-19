package Factory;

import Factory.Button.Button;
import Factory.Menu.Menu;
import Factory.UIFactory.UIFactory;

public class main {
    public static void main(String[] arg)
    {
        UIFactory uiFactory=Factory.getUIFactory(SupportedFactory.ANDROID);
        Button androidButton=uiFactory.createButton();
        Menu androidMenu=uiFactory.createMenu();
    }
}
