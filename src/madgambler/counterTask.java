/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madgambler;
import java.util.Timer;
import java.util.TimerTask;  
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shang
 */
public class counterTask extends TimerTask  {
    private int counter;
    private javax.swing.JLabel label;
    public counterTask(javax.swing.JLabel lbl){
        setCounter(30);
        label = lbl;
    }
    @Override
    public void run() {
        
        if(this.getCounter() < 1){
            
        }else{
            setCounter(this.getCounter()-1);
            label.setText("Time Left: "+getCounter());
        }
    }
    
    public void setCounter(int c){
        this.counter = c;
    }
    public int getCounter(){
        return counter;
    }
}
