package cucumber.cli;

import cucumber.io.FileResourceLoader;
import cucumber.runtime.Runtime;
import cucumber.runtime.RuntimeOptions;

import java.io.IOException;

public class Main {

    public static void main(String[] argv) throws Throwable {
        run(argv, Thread.currentThread().getContextClassLoader());
    }

    public static void run(String[] argv, ClassLoader classLoader) throws IOException {
        RuntimeOptions runtimeOptions = new RuntimeOptions(argv);

        Runtime runtime = new Runtime(new FileResourceLoader(), classLoader, runtimeOptions);
        runtime.writeStepdefsJson();
        runtime.run();
        System.exit(runtime.exitStatus());
    }
}
