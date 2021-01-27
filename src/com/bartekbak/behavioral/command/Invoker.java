package com.bartekbak.behavioral.command;

public class Invoker {
    public final ICommand commandOne;
    public final ICommand commandTwo;

    public Invoker(ICommand commandOne, ICommand commandTwo) {
        this.commandOne = commandOne;
        this.commandTwo = commandTwo;
    }

    public void useCommandOne() {
        this.commandOne.execute();
    }

    public void undoCommandOne() {
        this.commandOne.unexecute();
    }

    public void useCommandTwo() {
        this.commandTwo.execute();
    }

    public void undoCommandTwo() {
        this.commandTwo.unexecute();
    }
}
