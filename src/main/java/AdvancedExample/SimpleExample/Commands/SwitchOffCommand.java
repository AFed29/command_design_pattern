package AdvancedExample.SimpleExample.Commands;

import AdvancedExample.SimpleExample.Reciever.ISwitchable;

public class SwitchOffCommand implements ICommand {
    private ISwitchable switchable;

    public SwitchOffCommand(ISwitchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public void execute() {
        this.switchable.switchOff();
    }
}
