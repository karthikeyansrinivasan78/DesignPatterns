package DesignPattern.State;

public class SelectionTool implements MyTool{
    
    public void mouseUp(){
        System.out.println("Select icon");
    }
    
    public void mouseDown(){
        System.out.println("Tool Selected:Selection icon");
    }
}
