package Factory.Button;

public class IosButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Created IOS Button");
    }
}
