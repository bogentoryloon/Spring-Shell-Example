package com.liutaohua.springshell;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.shell.core.CommandResult;

/**
 * Created by Liutaohua on 2016/2/23 0023.
 */
public class HelloWorldCmdTest extends AbstractShellIntegrationTest {

	@Test
	public void dateTest() {
		// Execute command
		CommandResult cr = getShell().executeCommand("hd show --name liutaohua");
		assertEquals(cr.getResult().toString(), "your name is: liutaohua");
	}
}
