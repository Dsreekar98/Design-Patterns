package Decorator;

public class FaceBookDecorator extends BaseNotifierDecorator{
    public FaceBookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void sendMessage(String msg)
    {
        super.sendMessage(msg);
        System.out.println("Sending message via Facebook message = "+msg);

    }
}
