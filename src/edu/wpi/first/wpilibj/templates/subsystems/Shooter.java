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
    Jaguar shooter1;
    Jaguar shooter2;
    DigitalInput shooterRetreatSwitch;
    
    public Shooter() {
        pusher = new Relay(RobotMap.pusherSolenoid);
        shooter1 = new Jaguar(RobotMap.shooterMotor1);
        shooter2 = new Jaguar(RobotMap.shooterMotor2);
        shooterRetreatSwitch = new DigitalInput(RobotMap.shooterRetreatSwitch);
    }

    protected void initDefaultCommand() {
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
    
    public void runShooters() {
        //run shooter motors
        shooter1.set(0.70);
        shooter2.set(1.00);
    }
    
    public void doNothing() {
        shooter1.set(0.0);
        shooter2.set(0.0);
    }
    
    public boolean isRetreated() {
        return shooterRetreatSwitch.get();
    }
}
