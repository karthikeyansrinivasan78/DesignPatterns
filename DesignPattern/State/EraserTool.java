package DesignPattern.State;

public class EraserTool implements MyTool{
    /**
     * Implements mouse down operation for Eraser tool
     */
    @Override
    public void mouseDown(){
        System.out.println("Tool Selected: Erase icon");
    } 
    /**
     * Implements mouse up operation for Eraser tool
     */
    @Override
    public void mouseUp(){
        System.out.println("Eraser something");
    }
}
