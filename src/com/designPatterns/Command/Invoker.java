package com.designPatterns.Command;

public class Invoker {
    public ICommand commandOne;
    public ICommand commandTwo;

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
