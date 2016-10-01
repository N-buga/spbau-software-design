package ru.spbau.mit.commands;

import com.beust.jcommander.JCommander;
import org.junit.Test;
import ru.spbau.mit.Environment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junitx.framework.Assert.fail;

public class CommandAssignTest {

    @Test
    public void testRun() {
        Environment environment = new Environment();
        CommandAssign commandAssign = new CommandAssign();
        new JCommander(commandAssign, "a", "x");
        try {
            commandAssign.run(System.in, System.out, environment);
            assertEquals("x", environment.getValue("a"));
        } catch (IOException exception) {
            fail("Unexpected exception: ", exception);
        }
    }
}
