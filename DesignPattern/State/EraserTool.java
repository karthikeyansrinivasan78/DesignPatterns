package DesignPattern.State;

public class EraserTool implements MyTool{
   
    @Override
    public void mouseDown(){
        System.out.println("Tool Selected: Erase icon");
    } 
    @Override
    public void mouseUp(){
        System.out.println("Eraser something");
    }
}
