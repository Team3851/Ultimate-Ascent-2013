/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 3851
 */
public class Lift extends Subsystem{
    
    Jaguar lift_Mot; 
    private double speed = .25;
    
    public Lift() {
        lift_Mot = new Jaguar(RobotMap.liftMotor);
    }
    protected void initDefaultCommand() {
    }
    
    public void liftUP() {
        lift_Mot.set(speed);
    }
    
    public void liftDOWN() {
        lift_Mot.set(-speed);
    }
    
}
