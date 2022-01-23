package DesignPattern.State;

public class SelectionTool implements MyTool{
    
    public void mouseUp(){
        System.out.println("Selecta an object");
    }
    
    public void mouseDown(){
        System.out.println("Tool Selected:Selection icon");
    }
}
