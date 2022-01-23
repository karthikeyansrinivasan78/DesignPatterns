package DesignPattern.Memento;
/**
 * This class stores the EdiorState
 */
public class EditorState {
    private final String content;
    /**
     * Constructor
     * @param content : String
     */
    public EditorState(String content){
        this.content = content;
    }
    /**
     * Returns the Edirot state
     * @return content: String
     */
    public String getState(){
        return content;
    }
}
