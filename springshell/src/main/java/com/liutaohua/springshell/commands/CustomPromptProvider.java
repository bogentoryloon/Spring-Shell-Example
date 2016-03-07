package com.liutaohua.springshell.commands;

import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * Created by Liutaohua on 2016/1/25 0025.
 */
@Component
@Order(1)
public class CustomPromptProvider implements PromptProvider {

	public String getPrompt() {
		return "liutaohua-shell>";
	}

	public String getProviderName() {
		return "LiuTaoHuaShell";
	}

}
