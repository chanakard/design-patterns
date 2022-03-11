package com.designpattern.command;

public class ExecutePerson {

	public static void main(String[] args) {
		Television tele = new Television();
		RemoteController rc = new RemoteController();
		
		OnCommand oc = new OnCommand(tele);
		rc.setCommand(oc);
		rc.pressButton();
	}
}
