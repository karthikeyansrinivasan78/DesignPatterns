package DesignPattern.State;
/**
 * Class: Canvas
 * This class handles the selected tool at a time.
 */
public class Canvas{
    private MyTool currentTool;
    /**
     * Returns the tool selected
     * @return currentTool : MyTool
     */
    public MyTool getCurrentTool(){
        return currentTool;
    }
    /**
     * Sets current tools
     * @param tool: My Tool
     */
    public void setCurrentTool(MyTool tool){
        this.currentTool = tool;
    }
     /**
     * Routes mouse up operation to the selected tool
     */
    public void mouseUp(){
        ((MyTool) currentTool).mouseUp();
    }
     /**
     * Routes mouse down operation to the selected tool
     */
    public void mouseDown(){
        ((MyTool) currentTool).mouseDown();
    }
}