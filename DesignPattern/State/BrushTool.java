package DesignPattern.State;

public class BrushTool implements MyTool{

    @Override
    public void mouseDown(){
        System.out.println("Tool selected: Brush");
    }
    @Override
    public void mouseUp(){
        System.out.println("Draw a line");
    }
}
