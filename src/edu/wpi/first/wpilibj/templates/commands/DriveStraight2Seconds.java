/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author 3851
 */
public class DriveStraight2Seconds extends CommandBase{

    private int i;
    public DriveStraight2Seconds() {
        requires(drivetrain);
        setTimeout(2);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        //2000 cycles ~~ 0.9 seconds
        /*for (i=0; i<4000; i++) {
            drivetrain.mecanumDrive_Polar(.25, 0, 0);
        }*/
        drivetrain.mecanumDrive_Polar(.25, 0, 0);
    }

    protected boolean isFinished() {
        /*
        if (i<2000) {
            return false;
        }
        else {
            return true;
        }*/
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
