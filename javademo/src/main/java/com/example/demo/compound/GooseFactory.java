package com.example.demo.compound;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Goose createGoose() {
        return new Goose();
    }
}
