package ucu.edu.apps.task1;

import lombok.Getter;

@Getter
public class Tray { // one chain
    private Tray next;
    public int denomination;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray next) {
        this.next = next;
        return next;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        } else if (amount % denomination != 0) {
            throw new IllegalArgumentException("Unable to collect this amount.");
        }
        if (amount / denomination != 0) {
            System.out.format("Please take %d of denomination %d\n", amount / denomination, denomination);
        }
    }
}
