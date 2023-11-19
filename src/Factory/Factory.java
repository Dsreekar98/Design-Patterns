package Factory;

import Factory.UIFactory.AndroidUI;
import Factory.UIFactory.IosUI;
import Factory.UIFactory.UIFactory;

public class Factory {
    public static UIFactory getUIFactory(SupportedFactory platform)
    {
        return switch (platform)
        {
            case ANDROID-> new AndroidUI();
            case IOS-> new IosUI();
        };
    }

}
