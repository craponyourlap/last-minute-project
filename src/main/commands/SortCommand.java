package main.commands;

import java.util.Set;

public class SortCommand implements Command{
	//no need for subcommand set, since this is the last layer of subcommands
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Command> getSubCommands() {
		// TODO Auto-generated method stub
		return null;
	}

}
