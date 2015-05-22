/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madgambler;

import java.io.Serializable;

/**
 *
 * @author Shang
 */
public class Player implements Serializable {
    private int playerId;
    private int totalPoints;
    private int numOfBeans;
    private String name;
    
    public Player(int id){
        setPlayerId(id);
        setTotalPoints(0);
        setNumOfBeans(3);
    }
    
    //getters
    public int getPlayerId(){
        return this.playerId;
    }
    public int getTotalPoints (){
        return this.totalPoints;
    }
    public int getNumOfBeans(){
        return numOfBeans;
    }
    public String getName(){
        return name;
    }
    //setters
    public void setPlayerId(int id){
        this.playerId = id;
    }
    public void setTotalPoints(int p){
        this.totalPoints = p;
    }
    public void setNumOfBeans(int b){
        this.numOfBeans = b;
    }
    public void setName(String n){
        this.name = n;
    }
    
}
