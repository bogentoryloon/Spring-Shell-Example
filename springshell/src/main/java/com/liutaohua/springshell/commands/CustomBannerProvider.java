package com.liutaohua.springshell.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.stereotype.Component;

/**
 * Created by Liutaohua on 2016/1/25 0025.
 */

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
		return "Welcome to use LiuTaoHuaShell,You can input help to get more tip";
	}

	public String getProviderName() {
		return "LiuTaoHuaShell";
	}
}
