package com.liutaohua.springshell;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.shell.Bootstrap;
import org.springframework.shell.core.JLineShellComponent;

/**
 * Created by Administrator on 2016/2/23 0023.
 */
public abstract class AbstractShellIntegrationTest {
	private static JLineShellComponent shell;

	@BeforeClass
	public static void startUp() throws InterruptedException {
		Bootstrap bootstrap = new Bootstrap();
		shell = bootstrap.getJLineShellComponent();
	}

	@AfterClass
	public static void shutdown() {
		shell.stop();
	}

	public static JLineShellComponent getShell() {
		return shell;
	}
}
