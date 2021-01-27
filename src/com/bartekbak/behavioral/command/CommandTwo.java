package com.bartekbak.behavioral.command;

public class CommandTwo implements ICommand {
    private final Receiver receiver;

    public CommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.actionTwo();
    }

    @Override
    public void unexecute() {
        this.receiver.unActionTwo();
    }
}
