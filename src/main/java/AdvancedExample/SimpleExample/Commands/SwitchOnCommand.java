package AdvancedExample.SimpleExample.Commands;

import AdvancedExample.SimpleExample.Reciever.ISwitchable;

public class SwitchOnCommand implements ICommand {
    private ISwitchable switchable;

    public SwitchOnCommand(ISwitchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        this.switchable.switchOn();
    }
}
