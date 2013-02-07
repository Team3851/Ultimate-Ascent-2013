/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.feeder.FeederDoNothing;
import edu.wpi.first.wpilibj.templates.commands.feeder.FeederFeed;

/**
 * Andymark 9015 with gearbox used. For initial setup (one in the chamber, three ready to go), 
 * need to fire the feed command, halfway command, then load. At this point, feed command will take care of
 * loading the rest of the frisbees
 * 
 * Recommended next step: add dynamic time control (may not be needed as timing seems OK) 
 * 
 * 
 * @author 3851
 */
public class Feeder extends Subsystem{
    Relay feeder_Mot;
    
    //feeder run times (half vs full rotation)
    public double 
            feedRotation = 0.40,
            feedHalfRotation = .225;
    
    public Feeder() {
        feeder_Mot = new Relay(RobotMap.feederSpike);
    }
    protected void initDefaultCommand() {
        setDefaultCommand(new FeederDoNothing());
    }
    
    //spike relay ON
    public void feed() {
        feeder_Mot.set(Relay.Value.kOn);
    }
    
    //spike relay OFF
    public void doNothing() {
        feeder_Mot.set(Relay.Value.kOff);
    }
    
}
