package command;

public class CommandOne implements ICommand {
    private final Receiver receiver;

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
