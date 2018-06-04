package ie.dd.cli;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/2/23 0023.
 */
@Component
public class HelloWorldCmd implements CommandMarker {

	@CliCommand(value="countServers",help="provide number of servers")
	public String serverCount() {
		return String.format("server count = %d",5);
	}
	@CliCommand(value="listServers",help="enumerate all servers")
	public String listServers() {
		return String.format("server count = %d",5);
	}

	@CliCommand(value="addServer",help="create new server")
	public String addServer( @CliOption(key = { "id" }, mandatory = true, help = "unique id") final String id,
			@CliOption(key = { "name" }, mandatory = true, help = "name") final String name,
			@CliOption(key = { "description" }, mandatory = true, help = "description of server") final String description) {
		return String.format("server (%s,%s,%s) added",id,name,description);
	}
	@CliCommand(value="editServer",help="rename server")
	public String editServer( @CliOption(key = { "id" }, mandatory = true, help = "unique id") final String id,
			@CliOption(key = { "newname" }, mandatory = true, help = "new name") final String newname) {
			
		return "editserve "+id+newname;
	}
	@CliCommand(value="deleteServer",help="delete server")
	public String editServer( @CliOption(key = { "id" }, mandatory = true, help = "unique id") final String id) {
			
		return "delserve "+id;
	}
}
