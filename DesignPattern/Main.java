package DesignPattern;

import DesignPattern.Memento.Editor;
import DesignPattern.Memento.History;
import DesignPattern.State.BrushTool;
import DesignPattern.State.Canvas;
import DesignPattern.State.EraserTool;
import DesignPattern.State.SelectionTool;
import DesignPattern.State.StopWatch;
import DesignPattern.State.MyTool;
/**
 * Class: Main
 * Description: This class implements main mehtod. This method invokes all patterns.
 */
public class Main{
      public static void main(String[] args) {
        System.out.println("Learning Design Patterns");  
        mementoPattern(); 
        simpleStatePattern();
        complexStatePattern();
      }
/**
 * This method demonstrates the simple State pattern.
 * This does not require any complex implementation of logics to main the state
 * If you try to implement beyond this, it is a example of abusing the pattern.
 */
public static void simpleStatePattern(){
  var stopWatch = new StopWatch();
  System.out.println("\n***Simple State Pattern***");
  //click the stopwatch button 
  stopWatch.click();
  //click the stopwatch button again
  stopWatch.click();
  //click the stopwatch button again
  stopWatch.click();
}
  /**
   * This method demonstrates State pattern.
   * This is an example of a complex pattern, as the number of tools might increase from time to time when the need grows.
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
     * This is an exmple of remembering the do and undo kind of activities in any IDE.
     */
    public static void mementoPattern(){
      var editor = new Editor();
      var history = new History();

      System.out.println("\n***Memento State Pattern***");
      //Store all activities in History
      //#1 Activity A on the Editor
      editor.setContent("A" );
      history.push(editor.createEditorState());
      //#2 Activity B on the Editor
      editor.setContent("B" );
      history.push(editor.createEditorState());
      //#3 Activity C on the Editor
      editor.setContent("C" );
      
      //Undo or Revert to last activity
      System.out.println("Current State is " + editor.getContent());
      editor.restoreEditorState(history.pop());
      System.out.println("Previous State is " +editor.getContent());

      System.out.println("Current State is " + editor.getContent());
      editor.restoreEditorState(history.pop());
      System.out.println("Previous State is " +editor.getContent());
    }
}
