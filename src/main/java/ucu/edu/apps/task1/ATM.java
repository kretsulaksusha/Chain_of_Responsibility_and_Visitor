package ucu.edu.apps.task1;

public class ATM {
    public Tray firstTray;

    public ATM() {
        firstTray = new Tray1000();
        firstTray.setNext(new Tray500())
                 .setNext(new Tray200())
                 .setNext(new Tray100())
                 .setNext(new Tray50())
                 .setNext(new Tray20())
                 .setNext(new Tray10())
                 .setNext(new Tray5());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
