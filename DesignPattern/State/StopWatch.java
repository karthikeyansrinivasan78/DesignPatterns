package DesignPattern.State;

public class StopWatch {
    private StopwatchState currentState;
    public StopWatch(){
        //Assume Stopped
        this.currentState = StopwatchState.STOPPED;
    }
    
    public void click(){
        if(currentState == StopwatchState.STOPPED){
            currentState = StopwatchState.RUNNING;
            System.out.println("Stop watch is running.");
        }
        else {
            currentState = StopwatchState.STOPPED;
            System.out.println("Stop watch is stopped.");
        }
    }
}
