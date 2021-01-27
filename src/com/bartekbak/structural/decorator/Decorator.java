package com.bartekbak.structural.decorator;

public abstract class Decorator extends Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

}
