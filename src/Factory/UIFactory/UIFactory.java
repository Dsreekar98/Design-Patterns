package Factory.UIFactory;

import Factory.Button.Button;
import Factory.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
