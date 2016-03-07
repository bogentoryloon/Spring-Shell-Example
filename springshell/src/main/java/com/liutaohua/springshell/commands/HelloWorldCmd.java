package com.liutaohua.springshell.commands;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/2/23 0023.
 */
@Component
public class HelloWorldCmd implements CommandMarker {

	@CliCommand(value = "hd show", help = "input your name, and then show you.")
	public String fileLoader(@CliOption(key = { "name" }, mandatory = true, help = "your name") final String name) {
		System.out.println("starting ...");
		return "your name is: " + name;
	}
}
