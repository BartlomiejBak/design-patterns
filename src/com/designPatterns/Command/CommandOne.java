package com.designPatterns.Command;

public class CommandOne implements ICommand {
    private Receiver receiver;

    public CommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.actionOne();
    }

    @Override
    public void unexecute() {
        this.receiver.unActionOne();
    }
}
