package Factory.UIFactory;

import Factory.Button.Button;
import Factory.Button.IosButton;
import Factory.Menu.IosMenu;
import Factory.Menu.Menu;

public class IosUI implements UIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
