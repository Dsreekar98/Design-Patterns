package Decorator;

public abstract class BaseNotifierDecorator implements INotifier{
    private final INotifier wrapped;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void sendMessage(String msg) {
        wrapped.sendMessage(msg);
    }
}
