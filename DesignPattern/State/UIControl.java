package DesignPattern.State;

public abstract class UIControl {
    public abstract void draw();
    public void enable(){
        System.out.println("Enabled");
    }
    
}
