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
 *
 * @author 3851
 */
public class Feeder extends Subsystem{
    Relay feeder_Mot;
    public double 
            feedRotation = 0.40,
            feedHalfRotation = .225;
    
    public Feeder() {
        feeder_Mot = new Relay(RobotMap.feederMotor);
    }
    protected void initDefaultCommand() {
        setDefaultCommand(new FeederDoNothing());
    }
    
    public void feed() {
        feeder_Mot.set(Relay.Value.kOn);
    }
    
    public void doNothing() {
        feeder_Mot.set(Relay.Value.kOff);
    }
    
}
