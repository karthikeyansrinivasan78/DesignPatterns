package DesignPattern.Memento;

public class EditorState {
    private final String content;
    public EditorState(String content){
        this.content = content;
    }
    public String getState(){
        return content;
    }
}
