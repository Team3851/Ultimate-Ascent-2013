/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 3851
 */
public class Shooter extends Subsystem{
    Relay pusher;
    Jaguar shooter1;
    Jaguar shooter2;
    
    public Shooter() {
        pusher = new Relay(RobotMap.pusherSolenoid);
        shooter1 = new Jaguar(RobotMap.shooterMotor1);
        shooter2 = new Jaguar(RobotMap.shooterMotor2);
    }

    protected void initDefaultCommand() {
    }
    
    public void load() {
        //use solenoid pusher to load 
        pusher.set(Relay.Value.kOn);
    }
    
    public void retreat() {
        //retreat solenoid
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
}
