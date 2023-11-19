package Decorator;

public class Notifier implements INotifier{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending Message by Email message = "+msg);
    }
}
