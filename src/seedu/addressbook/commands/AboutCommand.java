package seedu.addressbook.commands;

import seedu.addressbook.Main;

/**
 * Show details about version and license info
 * of the program.
 * 
 * @author Tan Wang Leng
 */
public class AboutCommand extends Command {

    public static final String COMMAND_WORD = "about";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" + "Show details about the program.\n\t"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = Main.VERSION + "\n" + Main.AUTHOR + "\n" + Main.LICENSE;

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
