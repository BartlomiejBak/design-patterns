package com.designPatterns.Command;

public class CommandTwo implements ICommand{
    private Receiver receiver;

    public CommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }

    @Override
    public void unexecute() {
        this.receiver.unAction();
    }
}
