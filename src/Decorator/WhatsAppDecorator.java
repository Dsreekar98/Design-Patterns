package Decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void sendMessage(String msg)
    {
        super.sendMessage(msg);
        System.out.println("Sending message via WhatsApp message = "+msg);
    }
}
