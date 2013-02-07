/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.shooter.ShooterDoNothing;
import edu.wpi.first.wpilibj.templates.commands.shooter.ShooterRunShooters;

/**
 * Shooter assembly: two CIM motors running to fire, relay with window motor to push frisbees
 * onto shooter motors. Pusher has limit switch to indicate retreat position, time used for
 * loading
 * 
 *
 * @author 3851
 */
public class Shooter extends Subsystem{
    Relay pusher;
    Relay shooter1;
    Relay shooter2;
    DigitalInput shooterRetreatSwitch;
    
    public Shooter() {
        pusher = new Relay(RobotMap.pusherSpike);
        shooter1 = new Relay(RobotMap.shooterSpike1);
        shooter2 = new Relay(RobotMap.shooterSpike2);
        shooterRetreatSwitch = new DigitalInput(RobotMap.shooterRetreatSwitch);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new ShooterDoNothing());
    }
    
    //push window motor forward to load frisbee
    public void load() {
        //use solenoid pusher to load 
        pusher.set(Relay.Value.kOn);
    }
    
    //retreat window motor for next frisbee 
    //run until it hits limit switch
    public void retreat() {
        //retreat window mot
        pusher.set(Relay.Value.kReverse);
    }
    
    public void pusherDoNothing() {
        pusher.set(Relay.Value.kOff);
    }
    
    public void runShooters() {
        //run shooter motors
        shooter1.set(Relay.Value.kOn);
        shooter2.set(Relay.Value.kOn);
    }
    
    public void shootersDoNothing() {
        shooter1.set(Relay.Value.kOff);
        shooter2.set(Relay.Value.kOff);
    }
    
    
    public boolean isRetreated() {
        return shooterRetreatSwitch.get();
    }
}
