package com.designpattern.command;

public class OffCommand implements Command {

	Television tele;
	
	public OffCommand(Television tele)
	{
		this.tele = tele;
	}
	
	public void execute() {
		tele.off();
	}

}
