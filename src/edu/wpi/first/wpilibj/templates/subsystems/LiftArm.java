/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.LiftArmDoNothing;

/**
 *
 * @author 3851
 */
public class LiftArm extends Subsystem{
    Jaguar liftArm_Mot;
    private double speed = .20;
    
    public LiftArm() {
        liftArm_Mot = new Jaguar(RobotMap.liftArmMotor);
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new LiftArmDoNothing());
    }
    
    public void deployFwd() {
        liftArm_Mot.set(speed);
    }
    
    public void deployBck() {
        liftArm_Mot.set(-speed);
    }
    
    public void doNothing() {
        liftArm_Mot.set(0);
    }
}
