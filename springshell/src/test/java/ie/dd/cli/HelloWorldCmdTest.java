package ie.dd.cli;

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
		CommandResult cr = getShell().executeCommand("addServer --id 1 --name MyServer --description \"Big and Shiny\"");
		assertEquals(cr.getResult().toString(), "server (1,MyServer,Big and Shiny) added");
	}
}
