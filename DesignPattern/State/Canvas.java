package DesignPattern.State;

public class Canvas{
    private MyTool currentTool;

    public MyTool getCurrentTool(){
        return currentTool;
    }

    public void setCurrentTool(MyTool tool){
        this.currentTool = tool;
    }

    public void mouseUp(){
        ((MyTool) currentTool).mouseUp();
    }

    public void mouseDown(){
        ((MyTool) currentTool).mouseDown();
    }
}