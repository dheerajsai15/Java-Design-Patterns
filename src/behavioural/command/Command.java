package behavioural.command;

// ========= Command interface ===========
public interface Command {
    void execute();
    void undo();
}
