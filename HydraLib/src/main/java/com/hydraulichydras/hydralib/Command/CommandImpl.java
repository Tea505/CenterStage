package com.hydraulichydras.hydralib.Command;

public class CommandImpl implements Command{

    private Command command;

    protected boolean completed;

    public CommandImpl() { }

    public CommandImpl(Command command) {
        this.command = command;
        this.completed = false;
    }

    @Override
    public void run() {
        command.run();
        this.completed = true;
    }

    public void update() { }
}
