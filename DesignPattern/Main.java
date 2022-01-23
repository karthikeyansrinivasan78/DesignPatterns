package DesignPattern;

import DesignPattern.Memento.Editor;
import DesignPattern.Memento.History;
import DesignPattern.State.BrushTool;
import DesignPattern.State.Canvas;
import DesignPattern.State.EraserTool;
import DesignPattern.State.SelectionTool;
import DesignPattern.State.StopWatch;
import DesignPattern.State.MyTool;

public class Main{
      public static void main(String[] args) {
        System.out.println("Design. Learning Design Patterns");  
        mementoPattern(); 
        simpleStatePattern();
        complexStatePattern();
      }
/**
 * This method demonstrates the simple State pattern.
 * This does not require any complex implementation of logics to main the state
 */
public static void simpleStatePattern(){
  var stopWatch = new StopWatch();
  System.out.println("\n***Simple State Pattern***");
  stopWatch.click();
  stopWatch.click();
  stopWatch.click();
}
  /**
   * This method demonstrates State pattern.
   * 
   */
    public static void complexStatePattern() {
      var canvas = new Canvas();
      System.out.println("\n***Complex State Pattern***");
      canvas.setCurrentTool((MyTool)new SelectionTool());
      canvas.mouseDown();
      canvas.mouseUp();
      canvas.setCurrentTool((MyTool) new BrushTool());
      canvas.mouseDown();
      canvas.mouseUp();
      canvas.setCurrentTool((MyTool) new EraserTool());
      canvas.mouseDown();
      canvas.mouseUp();
    }

    /**
     * This method demonstrates Memento Pattern.
     */
    public static void mementoPattern(){
      var editor = new Editor();
      var history = new History();

      System.out.println("\n***Memento State Pattern***");
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
