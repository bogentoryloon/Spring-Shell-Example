package ie.dd.cli;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class CustomBannerProvider implements BannerProvider {

	public String getBanner() {
		return "";
	}

	public String getVersion() {
		return "v1.0.0";
	}

	public String getWelcomeMessage() {
		return "Welcome to use server manager, help is available ";
	}

	public String getProviderName() {
		return "ServerMgr";
	}
}
