package com.designpattern.command;

public class OnCommand implements Command {

	Television tele;
	
	public OnCommand(Television tele)
	{
		this.tele = tele;
	}
	public void execute() {
		tele.on();
	}

}
