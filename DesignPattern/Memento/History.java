package DesignPattern.Memento;

//Imports
import java.util.ArrayList;
import java.util.List;
/**
 * Class: History
 * This class implements editor history mechanism
 */
public class History {
    private List<EditorState> states = new ArrayList<>();
    /**
     * Appends the editor state in the history 
     * @param state
     */
    public void push(EditorState state){
        states.add(state);
    }
    /**
     * Returns last performed Editor state 
     * @return state : EditorState
     */
    public EditorState pop() {
        var lastIndex = states.size();
        var lastState = states.get (lastIndex - 1);
        states.remove(lastState);
        return lastState;
    }
}
