package DesignPattern.State;
/**
 * Class: Brush Tool
 * This class implements the brush tool 
 */
public class BrushTool implements MyTool{

    /**
     * Implements mouse down operation for Brush tool
     */
    @Override
    public void mouseDown(){
        System.out.println("Tool selected: Brush icon");
    }
     /**
     * Implements mouse up operation for Brush tool
     */
    @Override
    public void mouseUp(){
        System.out.println("Draw a line");
    }
}
