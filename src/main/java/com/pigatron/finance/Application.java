package com.pigatron.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.shell.CommandLine;
import org.springframework.shell.SimpleShellCommandLineOptions;
import org.springframework.shell.core.ExitShellRequest;
import org.springframework.shell.core.JLineShellComponent;
import org.springframework.util.StopWatch;

import java.io.IOException;

@SpringBootApplication
@ComponentScan({"org.springframework.shell", "com.pigatron.finance"})
public class Application {

	private static ApplicationContext context;
	private static StopWatch sw = new StopWatch("Spring Shell");
	private static CommandLine commandLine;

	public static void main(String[] args) throws IOException {
		sw.start();
		context = new SpringApplicationBuilder(Application.class).web(false).run(args);
		commandLine = SimpleShellCommandLineOptions.parseCommandLine(args);
		Application application = new Application();
		application.runShell();
	}

	@Bean
	public JLineShellComponent jLineShellComponent(){
		return new JLineShellComponent();
	}

	@Bean
	public CommandLine commandLine(){
		return new CommandLine(null,3000,null);
	}

	private ExitShellRequest runShell() {
		String[] commandsToExecuteAndThenQuit = commandLine.getShellCommandsToExecute();

		// The shell is used
		JLineShellComponent shell = context.getBean(JLineShellComponent.class);
		ExitShellRequest exitShellRequest;

		if (commandsToExecuteAndThenQuit != null) {
			boolean successful = false;
			exitShellRequest = ExitShellRequest.FATAL_EXIT;

			for (String cmd : commandsToExecuteAndThenQuit) {
				successful = shell.executeCommand(cmd).isSuccess();
				if (!successful)
					break;
			}

			// if all commands were successful, set the normal exit status
			if (successful) {
				exitShellRequest = ExitShellRequest.NORMAL_EXIT;
			}
		}
		else {
			//shell.start();
			shell.run();
			exitShellRequest = shell.getExitShellRequest();
			if (exitShellRequest == null) {
				// shouldn't really happen, but we'll fallback to this anyway
				exitShellRequest = ExitShellRequest.NORMAL_EXIT;
			}
			shell.waitForComplete();
		}

		((ConfigurableApplicationContext)context).close();
		sw.stop();
		if (shell.isDevelopmentMode()) {
			System.out.println("Total execution time: "+ sw.getLastTaskTimeMillis() + "ms");
		}
		return exitShellRequest;
	}


}
