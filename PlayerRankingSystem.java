/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playerrankingsystem;

/**
 *
 * @author User
 */
public class PlayerRankingSystem {

    private String PlayerId;
    private String Name;
    private String teamName;
    private double score;
    
    public PlayerRankingSystem(String PlayerId, String Name, String teamName,double score ){
        this.PlayerId = PlayerId;
        this.Name = Name;
        this.teamName = teamName;
        this.score = score;
        
    }
    
    public String getPlayerId(){return PlayerId;}
    public String getName(){return Name;}
    public String getteamName(){return teamName;}
    public double getscore(){return score;}
    
    public void display() {
        System.out.printf("%-10s %-15s %-15s %-10, lf%n", PlayerId, Name, teamName, score);
    }
}   
    

