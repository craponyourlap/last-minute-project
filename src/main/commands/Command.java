package main.commands;

import java.util.Set;

public interface Command {
	void execute();
	Set<Command> getSubCommands();
}
