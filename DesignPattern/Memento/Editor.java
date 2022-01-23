package DesignPattern.Memento;
/**
 * Class: Editor
 * Description: This class handls the Editor, creates and restores Ediror state.
 */
public class Editor {
    String content;
    /**
     * Returns the content 
     * @return: Content :String
     */
    public String getContent(){
        return content;
    }
    /**
     * Sets the content to the editor object
     * @param content: String
     */
    public void setContent( String content ){
        this.content = content;
    }
    /**
     * Creates the editor state and returns.
     * This will be stored in history list
     * @return EditorState
     */
    public EditorState createEditorState(){
        return new EditorState(content);
    }
    /**
     * Restores the editorstate when required.
     * @param state: EdirorState
     */
    public void restoreEditorState(EditorState state) {
        content = state.getState();
    }
}
