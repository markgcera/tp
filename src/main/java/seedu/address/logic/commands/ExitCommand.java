package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Exiting Address Book as requested ...";

    /**
     * Executes the exit command to terminate the program.
     *
     * @param model The current model.
     * @return A CommandResult indicating the program should be terminated.
     */
    @Override
    public CommandResult execute(Model model) {
        assert model != null;
        return new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true, false);
    }

}
