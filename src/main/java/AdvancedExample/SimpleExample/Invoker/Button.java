package AdvancedExample.SimpleExample.Invoker;

import AdvancedExample.SimpleExample.Commands.ICommand;

public class Button {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
