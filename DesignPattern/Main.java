package DesignPattern;


import DesignPattern.Memento.Editor;
import DesignPattern.Memento.History;

public class Main{
    public static void main(String[] args) {
      var user = new User("Karthik");
      user.name = "Karthik";
      System.out.println("User Name: " + user.name);  
      System.out.println("Memento Patter");  
      mementoPattern(); 
    }

    public static void mementoPattern(){
      var editor = new Editor();
      var history = new History();

      editor.setContent("A" );
      history.push(editor.createEditorState());
    
      editor.setContent("B" );
      history.push(editor.createEditorState());
      

      editor.setContent("C" );
      
      System.out.println("Current State is " + editor.getContent());
      editor.restoreEditorState(history.pop());
      System.out.println("Previous State is " +editor.getContent());

      System.out.println("Current State is " + editor.getContent());
      editor.restoreEditorState(history.pop());
      System.out.println("Previous State is " +editor.getContent());

    }
}
