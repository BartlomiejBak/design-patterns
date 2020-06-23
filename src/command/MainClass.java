package command;

public class MainClass {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ICommand firstCommand = new CommandOne(receiver);
        ICommand secondCommand = new CommandTwo(receiver);

        Invoker invoker = new Invoker(firstCommand, secondCommand);

        invoker.useCommandOne();
        invoker.useCommandTwo();
        invoker.undoCommandOne();
        invoker.undoCommandTwo();

    }
}
