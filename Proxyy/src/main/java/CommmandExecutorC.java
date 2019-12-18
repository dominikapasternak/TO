import java.io.IOException;

class CommandExecutorC implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}

