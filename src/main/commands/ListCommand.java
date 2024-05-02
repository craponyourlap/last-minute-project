package main.commands;

import java.util.Set;
import java.util.TreeSet;

public class ListCommand implements Command {
	Set<Command> subcommands = getSubCommands();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Set<Command> getSubCommands() {
		// TODO Auto-generated method stub
		Set<Command> sc = new TreeSet<>();
		sc.add(new SortCommand());
		sc.add(new SearchCommand());
		return sc;
	}

}
