package Factory.UIFactory;

import Factory.Button.AndriodButton;
import Factory.Button.Button;
import Factory.Menu.AndroidMenu;
import Factory.Menu.Menu;

public class AndroidUI implements UIFactory {
    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
