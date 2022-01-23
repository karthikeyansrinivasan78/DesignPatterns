package DesignPattern.Memento;

public class Editor {
    String content;
    public String getContent(){
        return content;
    }
    public void setContent( String content ){
        this.content = content;
    }
    public EditorState createEditorState(){
        return new EditorState(content);
    }
    public void restoreEditorState(EditorState state) {
        content = state.getState();
    }
}
