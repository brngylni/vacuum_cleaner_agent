/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixagent;

/**
 *
 * @author Mehmet Baran Geylani
 */
public class Agent {
    
    private int x;
    private int y;
    
    public Agent(){
        this.x = this.randomiser();
        this.y = this.randomiser();
        
    }
    
    public void clean(Environment env){
        var dirtyCounter = env.getDirtyCounter();
        int stepCounter=0;
        while(dirtyCounter >0){
            if(env.isDirty(this.x, this.y)){
                env.clean(this.x, this.y);
                env.printEnvironment(this.x, this.y);
                dirtyCounter--;
                this.randomAction();
            }else{
                env.printEnvironment(this.x, this.y);
                this.randomAction();
            }
            stepCounter++;
        }
        System.out.println("Cleaning has been completed in " + stepCounter + " steps.");
        
        
    }
    
    
    private void goLeft(){
        if(this.x != 0){
            this.x--;
        }else{
            this.randomAction();
        }
    }
    
    private void goRight(){
        if(this.x != 3){
            this.x++;
        }else{
            this.randomAction();
        }
    }
    private void goUp(){
        if(this.y != 0){
            this.y--;
        }else{
            this.randomAction();
        }
    }
    private void goDown(){
        if(this.y != 3){
            this.y++;
        }else{
            this.randomAction();
        }
    }
    private int randomiser(){
        return (int) Math.round(Math.random() * 3);
    }
    private void randomAction(){
        switch(this.randomiser()){
            case 0:
                this.goLeft();
                break;
            case 1:
                this.goRight();
                break;
            case 2:
                this.goUp();
                break;
            case 3:
                this.goDown();
                break;
        }
    }
    
    
    
}
