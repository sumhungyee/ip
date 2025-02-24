package duke.commands;

import duke.duke.Ui;
import duke.exceptions.StorerEmptyException;
import duke.storage.Storage;
import duke.storage.TaskList;

/**
 * A command to quit the programme.
 */
public class ByeCommand extends Command {
    public String execute(TaskList tasks, Ui ui, Storage storage) throws StorerEmptyException {
        String message = "Bye! Make sure to abide by OpenAI's content policies!";
        ui.display(message);
        return message;
    }

    /**
     * Notifies the programme that the user wishes to quit.
     * @return
     */
    public boolean isBye() {
        return true;
    }
}
