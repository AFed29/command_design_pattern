package AdvancedExample.SimpleExample.Commands;

import AdvancedExample.SimpleExample.Reciever.ITemperature;

public class HeatCommand implements ICommand {
    ITemperature temperature;

    public  HeatCommand(ITemperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        this.temperature.heat();
    }
}
