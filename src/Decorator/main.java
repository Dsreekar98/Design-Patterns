package Decorator;

public class main {
    public static void main(String[] arg)
    {
        INotifier notifier=new FaceBookDecorator(new WhatsAppDecorator(new Notifier()));
        notifier.sendMessage("Hello World");
    }

}
